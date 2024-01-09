class Solution {
    public int findCircleNum(int[][] isConnected) {
        Set<Integer> visited = new HashSet<>();
        int count=0;
        
        for(int i=0;i<isConnected.length;i++){
            if(!visited.contains(i)){
            dfs(i,isConnected,visited);
            count++;
            }
        }
        return count;
    }
    public void dfs(int i,int[][] isConnected,Set<Integer> visited){
        visited.add(i);
        for(int j=0;j<isConnected.length;j++){
            if(isConnected[i][j]==1&&!visited.contains(j))
                dfs(j,isConnected,visited);
        }
    }
}