class Solution
{
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        ArrayList<Integer> res=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        st.push(0);
        boolean vis[]=new boolean[V];
        while(!st.isEmpty()){
            int curr=st.peek();
            st.pop();
            if(!vis[curr]){
                vis[curr]=true;
                res.add(curr);
            }
            for(int i=adj.get(curr).size()-1;i>=0;i--){
                if(!vis[adj.get(curr).get(i)])
                    st.push(adj.get(curr).get(i));
            }
        }
        return res;
        
        
    }
}