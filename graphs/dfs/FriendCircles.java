public class Solution {
    public int findCircleNum(int[][] M) {
        int n = M.length ;
        
        boolean[] visited = new boolean[n];
        int friend_circles =0;
        
        for  ( int i=0 ;i<n ; i++)
        {
            if ( !visited[i]){
                findfriendsUtil( M, visited, i,n);
                friend_circles ++;

                
            }
        }
        return friend_circles;
        
    }
    
    public void findfriendsUtil( int [][]M, boolean[] visited , int i , int n ){
        for ( int j=0;j<M[0].length ;j++){
            if ( !visited[j] && M[i][j]== 1 && i<n ){
                visited[j] = true;
                findfriendsUtil(M, visited, j, n );
            }
        }
    }
}
