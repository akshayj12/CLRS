/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topologicalsort;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
//TO SOLVE ALL THE DEPENDENCIES TYPE QUESTIONS INVOLVING TOPOLOGICAL SORT
class Graph{
    static int v;
    public static LinkedList<Integer> adj[];
    
    Graph(int v){
        this.v = v;
        adj = new LinkedList[v];
        for ( int i =0 ; i < v ; i++){
            adj[i] = new LinkedList();
        }
    }
    public void addEdge(int u , int v){
        adj[u].add(v);
    }
}
public class TopologicalSort {

    void topologicalsort(){
        Stack s = new Stack();
        boolean[] visited = new boolean[Graph.v];
        
        for ( int i =0 ; i<Graph.v ; i++){
            visited[i]= false;
        }
        for( int i=0 ; i < Graph.v; i++){
            if(visited[i] == false){
                topologicalsortutil(i , s, visited);
            }
        }
        while (s.empty()==false)
            System.out.print(s.pop() + " ");
    }
    
    public void topologicalsortutil( int v ,Stack s , boolean[] visited){
        visited[v]= true;
        Integer i;
        Iterator<Integer> it = Graph.adj[v].iterator();
        while(it.hasNext()){
            i = it.next();
            if(!visited[i]){
                topologicalsortutil(i, s , visited);
            }
            
        }
        s.push(new Integer(v));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Graph g = new Graph(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
        TopologicalSort tp  = new TopologicalSort();
                tp.topologicalsort();

    }
    
}
