
//NO OF COMPONENTS

IF(NODE==PARENT[NODE]) THEN
    count++;

find(node) {
    if (node == parent[node]) {
        return node;
    }
    return find(parent[node]);
}


//3 methods

//make
void dsu(int n){
  
    parent=new int[n];
    size=new int[n];
    for(int i=0;i<n;i++){
        parent[i]=i;
        size[i]=1;
    }

}

//path compression
 int find(int node){
    if(node==parent[node]){
        return node;
    }
    return parent[node]=find(parent[node]);
  }

  //union by size
  void union(int u,int v){
    int ulp_u=find(u);
    int ulp_v=find(v);
    if(ulp_u==ulp_v) return;
    if(size[ulp_u]<size[ulp_v]){
        parent[ulp_u]=ulp_v;
        size[ulp_v]+=size[ulp_u];
    }
    else{
        parent[ulp_v]=ulp_u;
        size[ulp_u]+=size[ulp_v];
    }
  }


//////////////////////////////////
///   Modified DSU ///////////////
//////////////////////////////////

class Solution {
    int[] parent;
    int[] size;
    public ArrayList<Integer> DSU(int n, int[][] q) {
        // code here
        parent= new int[n+1];
        size= new int[n+1];
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=1;i<n+1;i++){
            parent[i]=i;
            size[i]=1;
        }
        for(int i=0;i<q.length;i++){
            if(q[i].length==2){
                ans.add(find(q[i][1]));
            }else{
                union(q[i][1],q[i][2]);
            }
        }
        return ans;
    }
    public int find(int node){
        if(parent[node]==node) return node;
        return parent[node]= find(parent[node]);
    }
    public void union(int n1,int n2){
        int p1= find(n1);
        int p2= find(n2);
        if(p1==p2) return;
        if(size[p1]>size[p2]){
            parent[p2]=p1;
            find(n2);
            size[p1]+=size[p2];
        }else{
            parent[p1]=p2;
            find(n1);
            size[p2]+=size[p1];
        }
    }
}
