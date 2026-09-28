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
