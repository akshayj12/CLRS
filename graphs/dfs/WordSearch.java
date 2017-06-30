public class Solution {
    public int exist(ArrayList<String> a, String b) {
        int n = a.size();
        int m = a.get(0).length();
        if ( n==0 || m==0)
            return 0;
        int result =0;
        for ( int i =0;i<n;i++){
            for ( int j=0;j<m;j++){
                if ( dfs( a, i, j , 0 , b))
                    {
                        result =1;
                    return result;
                        
                    }
            }
        }
        return result;
    }
    
    public boolean dfs(ArrayList<String> a, int i, int j, int k, String b  ){
         int n = a.size();
        int m = a.get(0).length();
        if ( i<0 || i>=n || j<0 || j>=m)
            return false;
        if ( a.get(i).charAt(j) != b.charAt(k))
           { 
               return false;
           }
       if ( a.get(i).charAt(j) == b.charAt(k)){
           
            if ( b.length()-1 == k){
                return true;
                
            }
           else if ( dfs( a,    i+1,     j , k+1, b)
                    || dfs( a, i-1,     j , k+1, b)
                    ||dfs( a,   i,  j+1,k+1,b) 
                    || dfs(a,   i,  j-1,k+1,b))
           {
               
               return true;
           }
           
       }
        return false;
       
    }
    
}

