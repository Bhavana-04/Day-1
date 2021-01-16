class Solution {
    public void dfs(char[][] grid,int x,int y){
        if(x<0 || y<0)
            return;
        else if(x>=grid.length || y>=grid[0].length)
            return;
        else if(grid[x][y]=='0' || grid[x][y]=='2')
            return;
        else
            grid[x][y]='2';
        dfs(grid,x+1,y);
        dfs(grid,x-1,y);
        dfs(grid,x,y+1);
        dfs(grid,x,y-1);
    }
    public int numIslands(char[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        int islands=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]=='1'){
                    islands+=1;
                    dfs(grid,i,j);
                }
            }
        }
        return islands;
    }
}