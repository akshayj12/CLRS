/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package steppingnumbers;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author AkshayJain
 */
public class SteppingNumbers {
    public static void bfs( int n, int m , int i){
        Queue< Integer> q = new LinkedList<Integer> ();
        q.add( i );
        while( !q.isEmpty()){   
            int num = q.poll();
            //System.out.println(num);
            if ( num >=n && num <= m )
                   System.out.println(num);
            if ( num ==0 || num >m || num < 0)// very important comdition
                continue;
            int lastdigit = num % 10;
            
            int jumpA = num*10 + (lastdigit+1);
            int jumpB = num*10 + (lastdigit-1);
            
            if ( lastdigit ==0)
                q.add(jumpA);
            else if( lastdigit == 0)
                q.add( jumpB);
            else{
                q.add( jumpA);
                q.add(jumpB);
            }
            
            
        }
        
    }
    
   public static  void  displaysteppingnumbers( int n , int m ){
       for ( int i=0 ; i <= 9 ; i++)
           bfs(n , m , i );       
   }
    public static void main(String[] args) {
        // TODO code application logic here
        displaysteppingnumbers(0, 21);
        
    }
    
}
