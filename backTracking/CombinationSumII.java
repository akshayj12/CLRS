/*

Given a collection of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

Each number in C may only be used once in the combination.
*/
public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    List<Integer> curr = new ArrayList<Integer>();
    if (candidates.length == 0 || candidates == null )
        return result;
    Arrays.sort(candidates);
    dfs(result, curr, 0, target, candidates,0);
    return result;
    }
    
    public void dfs( List<List<Integer>> result,List<Integer> curr, int k , int target, int[] candidates, int sum ){
        if ( target == sum){
            result.add(new ArrayList<Integer>(curr));
            return;
        }
        if ( target < sum)
            return;
        int prev =-1;
        for ( int i =k ; i< candidates.length;i++){
            if ( prev != candidates[i]){
                curr.add( candidates[i]);
                dfs( result, curr, i+1, target, candidates, sum+candidates[i]);
                curr.remove( curr.size()-1);
                prev = candidates[i];
            }
        }
        
        
    }
}
