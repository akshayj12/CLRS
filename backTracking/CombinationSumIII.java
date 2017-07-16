/*
Find all possible combinations of k numbers that add up to a number n, given that only numbers from 1 to 9 can be used and each combination should be a unique set of numbers.
*/
public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
         List<List<Integer>> result = new ArrayList<List<Integer>>();
    List<Integer> curr = new ArrayList<Integer>();
    dfs(result, curr, k, 1, n,0);
    return result;
    }
    
    public void dfs( List<List<Integer>> result , List<Integer> curr, int k, int index, int n , int sum){
        
        if ( curr.size() == k && n == sum){
            result .add(new ArrayList(curr));
            return;
        }
        
        for ( int i = index ; i <= 9; i++){
            
            if ( sum > n)
                return ;
                
            curr.add( i);
            dfs( result, curr,k,  i+1, n, sum+i);
            curr.remove( curr.size()-1);
        }
        
        
    }
    
}
