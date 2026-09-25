
//Direction Array
int[] dirX= new int[]{0,0,1,-1};
int[] dirY= new int[]{1,-1,0,0};

//queue or priority queue can also be used
Deque<int[]> d = new ArrayDeque<>();

//initialise with start
d.addFirst(new int[]{0,0});


int m=grid.length;
int n= grid[0].length;
int[][] time= new int[m][n];
for(int i=0;i<m;i++){
    Arrays.fill(time[i],Integer.MAX_VALUE);
}

while(!d.isEmpty()){
    int[] temp= d.pop();
    int r=temp[0];
    int c=temp[1];
    for(int k=0;k<4;k++){
      //condition for valid index
      if(r+dirX[k]>-1 && r+dirX[k]<m && c+dirY[k]>-1 && c+dirY[k]<n){
        //add condition based on question
          d.addFirst(new int[]{r+dirX[k],c+dirY[k]});
      }
    }
}