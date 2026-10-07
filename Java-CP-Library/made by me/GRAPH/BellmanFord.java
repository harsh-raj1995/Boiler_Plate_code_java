//use int[] as return type instead of ArrayList<Integer> to avoid TLE

public int[] bellmanFord(int V, int[][] edges, int src) {
        // code here
        int inf=100000000;
        int[] dis = new int[V];
        for(int i=0;i<V;i++){
            dis[i] = inf;
        }
        dis[src] = 0;
        for(int i=0;i<V;i++){
            for(int[] e:edges){
                if(dis[e[0]]!=inf && dis[e[0]]+e[2]<dis[e[1]]){
                    if(i==V-1){
                        return new int[]{-1};
                    }
                    dis[e[1]] = dis[e[0]] + e[2];
                }
            }
        }
        return dis;
    }

//V>10^4 it wont work
//fing neg edge cycle if v-1 iteration update the array
// work on directed graph