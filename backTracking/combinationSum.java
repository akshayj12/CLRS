/*
Given a set of candidate numbers (C) (without duplicates) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

The same repeated number may be chosen from C unlimited number of times.
*/
public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
         List<Integer> temp = new ArrayList<Integer>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if ( candidates.length ==0 || candidates == null)
            return result;
        Arrays.sort(candidates);
        dfs ( candidates, result, temp,0, target,0);
        return result;
        
    }
    
    public void dfs ( int[] candidates, List<List<Integer>> result, List<Integer> temp, int sum , int target , int k  ){
        if (target == sum){
             List<Integer> curr = new  ArrayList<Integer>(temp);
             result.add( curr);
             return ;
        }
        
       
        for ( int i=k;i<candidates.length;i++){
        if ( sum > target)
            return;
        temp.add( candidates[i]);
        dfs( candidates, result, temp, sum+candidates[i], target,i);
        temp.remove( temp.size()-1);
            
        }
    }
}
