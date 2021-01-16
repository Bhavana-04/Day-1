class Solution
{
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        ArrayList<Integer> res=new ArrayList<>();
        ArrayList<Integer> al;
        Queue<ArrayList<Integer>> q=new LinkedList<>();
        al=new ArrayList<>();
        al.add(0);
        q.add(al);
        boolean vis[]=new boolean[V];
        while(!q.isEmpty()){
            al=q.poll();
            for(int j=0;j<al.size();j++){
                int curr=al.get(j);
                if(!vis[curr]){
                    res.add(curr);
                    q.add(adj.get(curr));
                    vis[curr]=true;
                }
            }
        }
        return res;
    }
}