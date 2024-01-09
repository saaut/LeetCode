class Solution {
    public int numIslands(char[][] grid) {
        Set<String> visited =new HashSet<>();
        int island=0;
        for(int i=0;i<grid.length;i++){//i가 세로
            for(int j=0;j<grid[0].length;j++){//j가 가로
                if(!visited.contains(i+"+"+j)&&grid[i][j]=='1'){
                    island++;
                    dfs(i,j,visited,grid);
                }
            }
        }
        return island;
    }
       static public void dfs(int i,int j,Set<String> visited,char[][] grid){
        visited.add(i+"+"+j);//현재 노드 추가

        //연결된 다음 노드에 대한 과정(상하좌우)
        //i가 세로 j가 가로
        String left=i+"+"+(j-1);
        String right=i+"+"+(j+1);
        String down=(i+1)+"+"+j;
        String up=(i-1)+"+"+j;
        if(j-1>=0&&grid[i][j-1]=='1'&&!visited.contains(left)){//상하좌우 노드가 visited에 포함되어있지 않고, 1이라면
            dfs(i,j-1,visited,grid);//연결된 노드에 대한 dfs
        }
        if(j+1<grid[0].length&&grid[i][j+1]=='1'&&!visited.contains(right)){//상하좌우 노드가 visited에 포함되어있지 않고, 1이라면
            dfs(i,j+1,visited,grid);//연결된 노드에 대한 dfs
        }
        if(i+1<grid.length&&grid[i+1][j]=='1'&&!visited.contains(down)){//상하좌우 노드가 visited에 포함되어있지 않고, 1이라면
            dfs(i+1,j,visited,grid);//연결된 노드에 대한 dfs
        }
        if(i-1>=0&&grid[i-1][j]=='1'&&!visited.contains(up)){//상하좌우 노드가 visited에 포함되어있지 않고, 1이라면
            dfs(i-1,j,visited,grid);//연결된 노드에 대한 dfs
        }
    }
}