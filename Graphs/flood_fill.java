class Solution {
    public void dfs(int [][]image,int x,int y,int newColor,int start){
        if(x<0 || y<0)
            return;
        else if(x>=image.length || y>=image[0].length)
            return;
        else if(image[x][y]!=start)
            return;
        else
            image[x][y]=newColor;
        dfs(image,x-1,y,newColor,start);
        dfs(image,x+1,y,newColor,start);
        dfs(image,x,y-1,newColor,start);
        dfs(image,x,y+1,newColor,start);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int s=image[sr][sc];
        if(image[sr][sc]==newColor)
            return image;
        dfs(image,sr,sc,newColor,s);
        return image;
    }
}