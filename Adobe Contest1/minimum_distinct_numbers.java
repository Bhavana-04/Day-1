class Solution{
    static int mindistinct(int[] Arr,int N,int k){
        //code here
        //Create a HashMap
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        //put data of an array in to the hashmap
        for(int i=0;i<N;i++){
            if(!hm.containsKey(Arr[i])){
                hm.put(Arr[i],1);
            }
            else{
                int v=hm.get(Arr[i]);
                hm.put(Arr[i],v+1);
            }
        }
        //sorting the hashmap according to the values
        //1.Create a list of elements from hashmap
        List<Map.Entry<Integer,Integer>> list=new LinkedList<Map.Entry<Integer,Integer>>(hm.entrySet());
        //2.sort the list
        Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>(){
            public int compare(Map.Entry<Integer,Integer> o1,Map.Entry<Integer,Integer> o2){
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        //3.Create a hashmap hm1
        HashMap<Integer,Integer> hm1=new LinkedHashMap<Integer,Integer>();
        //4.put data from the sorted list to the hashmap
        for(Map.Entry<Integer,Integer> i:list){
            hm1.put(i.getKey(),i.getValue());
        }
        //create a hashset
        HashSet<Integer> hs=new HashSet<>();
        //removing the k numbers and adding the remaining in to the hashset
        for(Map.Entry<Integer,Integer> me:hm1.entrySet()){
            int val=me.getValue();
            int key=me.getKey(); 
            if(k==0){
                hs.add(key);
            }
            else if(val<k){
                k=k-val;
            }
            else if(val==k){
                k=0;
            }
            else if(val>k){
                k=0;
                hs.add(key);
            }
        }
        //return the size of the hashset=>distinct minimum numbers after removing k numbers
        return hs.size();
    }
    
}