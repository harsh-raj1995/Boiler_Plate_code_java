// it start from 0 do -1 if start with 1

public ArrayList<Integer> dijkstra(int V, int[][] edges, int src) {
        
        List<List<int[]>> adj = new ArrayList<>();
        ArrayList<Integer> dis= new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
            dis.add(Integer.MAX_VALUE);
        }
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(new int[]{edges[i][1],edges[i][2]});

            // remove below for undirected graph
            adj.get(edges[i][1]).add(new int[]{edges[i][0],edges[i][2]});
        }
        
        PriorityQueue<int[]> pq= new PriorityQueue<>((a,b)->(a[0]-b[0]));
        
        pq.add(new int[]{0,src});
         
        dis.set(src,0); 
        while(!pq.isEmpty()){
            int[] u = pq.poll();

            // previously added node in pq which is now not needed
            if(dis.get(u[1])<u[0]) continue;

            for(int i=0;i<adj.get(u[1]).size();i++){
                int[] v = adj.get(u[1]).get(i);

                //relaxation formula - d[u]+wt<d[v] then update and add
                if(u[0]+v[1]<dis.get(v[0])){
                    dis.set(v[0],u[0]+v[1]);
                    pq.add(new int[]{dis.get(v[0]),v[0]});
                }
            }
        }
        return dis;
        
    }


    //timr - elogv


    // for k consicutive 

    class Solution {
    public int shortestPath(int n, int[][] edges, String labels, int k) {
        List<List<int[]>> adj = new ArrayList<>();
        int[] cnt=new int[n];
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
            cnt[i]=k+1;
        }
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(new int[]{edges[i][1],edges[i][2]});
        }
        
        PriorityQueue<long[]> pq= new PriorityQueue<>((a,b)->(Long.compare(a[0],b[0])));
        
        pq.add(new long[]{0,1,0});
         
        while(!pq.isEmpty()){
            long[] u = pq.poll();
            long d= u[0];
            int count=(int)u[1];
            int x= (int)u[2];
            if(count>=cnt[x]) continue;
            
            if(x==n-1) return (int)d;
            cnt[x]=count;
            

            for(int[] v : adj.get((int)u[2])){
                int y= v[0];
                int r=1;
                if(labels.charAt(y)==labels.charAt(x)) r= count+1;

                if(r<cnt[y]){
                    pq.add(new long[]{d+v[1],r,y});
                }
            }
        }
        return -1;
    }
}