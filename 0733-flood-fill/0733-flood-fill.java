class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color)
            return image;
        dfs(image,sr,sc,image[sr][sc],color);
        return image;
    }
    public void dfs(int[][] image,int row, int column, int oldColor, int newColor){
        if(row<0||column<0||row>image.length-1||column>image[0].length-1||image[row][column]!=oldColor)
            return;
        
        image[row][column]=newColor;
        
        dfs(image,row,column+1,oldColor,newColor);
        dfs(image,row,column-1,oldColor,newColor);
        dfs(image,row+1,column,oldColor,newColor);
        dfs(image,row-1,column,oldColor,newColor);
    }
    
    
}