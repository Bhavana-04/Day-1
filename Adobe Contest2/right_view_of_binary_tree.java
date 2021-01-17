class Tree{
    ArrayList<Integer> rightView(Node root) {
        //add code here.
        //create queue
        Queue<Node> q=new LinkedList<>();
        ArrayList<Integer> al=new ArrayList<>();
        q.add(root);
        //by using level order traversal
        while(!q.isEmpty()){
            //number of nodes in a level
            int n=q.size();
            for(int i=0;i<n;i++){
                Node curr=q.poll();
                //adding the last node in a level 
                if(i==n-1){
                    al.add(curr.data);
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        return al;
    }
}