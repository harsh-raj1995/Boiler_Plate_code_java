//time - o(V^3)
// directed graph only 
//detect cycle when dist[i][j] is neg


// update the distance matrix - if dont have make one


public void floydWarshall(int[][] dist) {
        // Code here

        //based on question req
        int inf=100000000;
        int n = dist.length;
        //via loop will be first
        for(int k=0;k<n;k++){
            for(int j=0;j<n;j++){
                for(int i=0;i<n;i++){

                  //condition if no route via k then
                    if(dist[j][k]==inf || dist[k][i]==inf) continue;
                    dist[j][i]=Math.min(dist[j][i],dist[j][k]+dist[k][i]);
                }
            }
        }
    }