public int spanningTree(int n, int[][] edges) {
        // code here
        List<List<int[]>> adj= new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int[] visited=new int[n];
        for(int[] e:edges){
            adj.get(e[0]).add(new int[]{e[2],e[1]});
            adj.get(e[1]).add(new int[]{e[2],e[0]});
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->(a[0]-b[0]));
        pq.add(new int[]{0,0});
        int ans=0;
        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            if(visited[curr[1]]==1) continue;
            else{
                visited[curr[1]]=1;
                ans+=curr[0];
                for(int[] temp: adj.get(curr[1])){
                    pq.add(temp);
                }
            }
        }
        return ans;
    }