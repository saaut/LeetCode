class Solution {
    public int findCircleNum(int[][] isConnected) {
        Set<Integer> visited=new HashSet<>();
        int count=0;
        
        for(int i=0;i<isConnected.length;i++){
            if(!visited.contains(i)){
                count++;
                dfs(i,isConnected,visited);
            }
        }
        return count;
    }
    
    public void dfs(int node,int[][] isConnected,Set<Integer>visited){
        visited.add(node);
        for(int adj=0;adj<isConnected[node].length;adj++){
            if(!visited.contains(adj)&&isConnected[node][adj]==1){
                dfs(adj,isConnected,visited);
            }
        }
        
    }
}