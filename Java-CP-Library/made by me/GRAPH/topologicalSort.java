class Solution {
    public int[] findOrder(int n, int[][] edges) {
        int[] indegree = new int[n+1];
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] dir: edges){
            adj.get(dir[1]).add(dir[0]);
            indegree[dir[0]]=indegree[dir[0]]+1;
        }
        int[] v= new int[n];
        int[] ans=new int[n];
        Queue<Integer> q= new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        int idx=0;
        while(!q.isEmpty()){
            int curr=q.poll();
            v[curr]=1;
            ans[idx++]=curr;
            for(int nxt: adj.get(curr)){
                indegree[nxt]--;
                if(indegree[nxt]==0) q.offer(nxt);
            }
            
        }
        for(int i=0;i<n;i++){
            if(v[i]==0) return new int[0];
        }
        return ans;
    }
}