public class Fendwik {

  static int[] bits=new int[6];
  static void build(int[] arr){
    for(int i=1;i<arr.length+1;i++){
      bits[i]+=arr[i-1];
      int p=i+(i&-i);
      if(p<arr.length) bits[p]+=bits[i];
    }
  }
  static int sum(int i){
    int sum=0;
    for(;i>0;i=i&(i-1)){
      sum+=bits[i];
    }
    return sum;
  }
  static void update(int i,int val){
    for(;i<bits.length;i=i+(i&-i)){
      bits[i]+=val;
    }
  }
  public static void main(String[] args) {
    int[] arr= new int[]{1,3,5,7,9};
    build(arr);
    System.out.println(sum(3));
    System.out.println(java.util.Arrays.toString(bits));
    update(3, 10);
    System.out.println(sum(3));
    System.out.println(java.util.Arrays.toString(bits));

  }
}
