//Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
 class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> temp = new ArrayList<Integer>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        if( n<=0 || k==0 || k>n)
           return result;
           
        combinations(n , k , 1, temp, result);
        return result;
    }
    
     public void combinations( int n , int  k , int index  , List<Integer> temp , List<List<Integer>> result ){
         
         if(temp.size() == k ){
             result.add( (new ArrayList<Integer>(temp)));
             return;
         }
         for ( int i =index ; i <= n;i++){
             temp.add(i);
             combinations( n , k  , i+1 , temp , result);
             temp.remove(temp.size()-1);
             
         }
         
}
}
