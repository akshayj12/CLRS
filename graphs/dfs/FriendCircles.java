/*Question from Leetcode-547 , Hackerrank
There are N students in a class. Some of them are friends, while some are not. Their friendship is transitive in nature. For example, if A is a direct friend of B, and B is a direct friend of C, then A is an indirect friend of C. And we defined a friend circle is a group of students who are direct or indirect friends.

Given a N*N matrix M representing the friend relationship between students in the class. If M[i][j] = 1, then the ith and jth students are direct friends with each other, otherwise not. And you have to output the total number of friend circles among all the students. 

*/

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
