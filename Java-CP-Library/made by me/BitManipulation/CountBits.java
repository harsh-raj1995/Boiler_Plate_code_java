//Brian Kernighan's Algorithm

int countBits(int n){
  int res=0;
  while(n>0){
    n=n&(n-1);
    res++;
  }
  return res;
}


//Lookup table solution


int countBitsLookup(int n){

  int[] lookup=new int[256];
  for(int i=0;i<256;i++){
    lookup[i]=lookup[i&(i-1)]+1;
  }

  //lookup table is built such that lookup[i] contains the number of set bits in the integer i. The loop fills this table for all integers from 0 to 255.

  //0xff is 255, so we are masking the last 8 bits of n and using that as an index to the lookup table. Then we shift n right by 8 bits and repeat for the next 8 bits, and so on for all 32 bits of the integer.

  return lookup[n&0xff]+lookup[(n>>8)&0xff]+lookup[(n>>16)&0xff]+lookup[(n>>24)&0xff];
}
