/*
Given a set of distinct integers, S, return all possible subsets.
Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
lso, the subsets should be sorted in ascending ( lexicographic ) order.
*/

public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> a) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        Collections.sort(a);
        if ( a.size() <= 0 || a == null){
            result.add(temp);
            return result;
        }
       
       for ( int i=0;i<=a.size();i++){
           subsetUtil( a, result, temp, 0, i);
       }
       
       Collections.sort(result, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> a, ArrayList<Integer> b) {
                int an = a.size();
                int bn = b.size();
                for (int i = 0; i < Math.min(an, bn); i++) {
                    int cmp = Integer.compare(a.get(i), b.get(i));
                    if (cmp != 0)
                        return cmp;
                }
                return Integer.compare(a.size(), b.size());
            }
        });
       return result;
           
        
    }
    
    public void subsetUtil(ArrayList<Integer> a,ArrayList<ArrayList<Integer>> result,ArrayList<Integer> temp,
                    int index, int k   ){
           if (temp.size() == k )
            {
                result.add( new ArrayList<Integer>(temp));
                return;
            }
            for ( int i=index;i<a.size() ;i++){
                temp.add(a.get(i));
                dfs(a,result, temp, i+1,k);
                temp.remove(temp.size()-1);
            }
        
    }
}

