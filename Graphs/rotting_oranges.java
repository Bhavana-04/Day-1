class Solution {
    public void bfs(Queue<ArrayList<Integer>> q,int x,int y,int time,int [][]grid){
        ArrayList<Integer> al;
        if(x<0 || y<0)
            return;
        if(x>=grid.length || y>=grid[0].length)
            return;
        if(grid[x][y]==0 || grid[x][y]==2)
            return;
        else if(grid[x][y]==1){
            al=new ArrayList<>();
            grid[x][y]=2;
            al.add(time+1);
            al.add(x);
            al.add(y);
            q.add(al);
        }
        
    }
    public int orangesRotting(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        ArrayList<Integer> al;
        int c=0;
        Queue<ArrayList<Integer>> q=new LinkedList<>();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==2){
                    al=new ArrayList<>();
                    al.add(0);
                    al.add(i);
                    al.add(j);
                    q.add(al);
                }
            }
        }
        int time=0;
        while(!q.isEmpty()){
            al=q.poll();
            time=al.get(0);
            int x=al.get(1);
            int y=al.get(2);
            bfs(q,x+1,y,time,grid);
            bfs(q,x-1,y,time,grid);
            bfs(q,x,y+1,time,grid);
            bfs(q,x,y-1,time,grid);
        }
        //System.out.println(c);
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1)
                    return -1;
            }
        }
        return time;
    }
}