public class Solution {
    public int numIslands(char[][] grid) {
        if(  grid == null || grid.length ==0 ||grid[0].length==0) 
            return 0;
        int n = grid.length;
        int m  = grid[0].length;
       // if ( n==0 || m==0 )
         //   return 0;
        boolean [][] visited = new boolean [n][m];
        int count =0;
        for ( int i=0 ; i<n;i++){
            for ( int j=0; j<m ; j++){
                if(!visited[i][j] && grid[i][j] == '1'){
                    dfs(grid, visited, n , m, i , j  );
                    count++;
                    
                }
            }
        }
        return count;
    }
    
    public void dfs( char[][] grid, boolean[][] visited, int n , int m, int i , int j ){
      
             if(i<0||i>=n||j<0||j>=m|| grid[i][j]!='1' || visited[i][j])
                     return;
           

            visited[i][j]=true;
            dfs(grid, visited, n,m,i-1,j );
            dfs(grid, visited, n,m,i+1,j );
            dfs(grid, visited, n,m,i,j-1 );
            dfs(grid, visited, n,m,i,j+1 );
                    

        
    }
}
