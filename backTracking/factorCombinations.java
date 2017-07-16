/*

Write a function that takes an integer n and return all possible combinations of its factors.

Note:
You may assume that n is always positive.
Factors should be greater than 1 and less than n.
*/
class Solution{
    public List<List<Integer>> getFactors(int n) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    List<Integer> list = new ArrayList<Integer>();
    if ( n ==0 || n< 0){
    return result;
    }
    helper(n, 2, 1, result, list);
    return result;
}
    helper( int n , int index, int product,List<List<Integer>> result, List<Integer> curr){
    if ( product > n || index>n){
        return;
    }
    if ( product == n) {
    result.add( new ArrayList<Integer>(curr);
    return;   
    }  

    for ( int i = index ; i <n ;i++){
        if ( product*i > n)
            break;
        
        if ( n%i ==0){
            curr.add(i);
            helper( n, i,product*i, result, curr);
            curr.remove( curr.size()-1);
            }
    }
 
}


