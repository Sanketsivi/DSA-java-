
    

import java.util.*;

public class topoloical {
    static class Edge{
        int src;
        int des;
        Edge(int s,int d){
            this.src=s;
            this.des=d;
        }
    }
public static void insert(ArrayList<Edge> graph[]){
    for(int i=0;i<graph.length;i++){
        graph[i]=new ArrayList<Edge>();

    }
    

    
   

   
    graph[2].add(new Edge(2,3));
    
    graph[3].add(new Edge(3,1));
    

      graph[4].add(new Edge(4,0));
      graph[4].add(new Edge(4,1));
      

      graph[5].add(new Edge(5,0));
      graph[5].add(new Edge(5,2));
      

   



      }
      public static void topologicalsort(ArrayList<Edge>graph[],boolean vis[],int curr,Stack stack){
        vis[curr]=true;
        
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.des]){
              topologicalsort(graph,vis,e.des,stack);
        }
        
    }
    stack.add(curr);
       
 }
 public static void topo(ArrayList<Edge> graph[],int V){
    boolean vis[]=new boolean[V];
    Stack stack=new Stack();
    for(int i=0;i<V;i++){
    if(!vis[i]){
        topologicalsort(graph, vis, i, stack);
    }
    }
    while(stack!=null){
        System.out.println(stack.pop()+" ");

    }

 }
    
    


        
 
    
    public static void main(String []ars){
        int n=6;
        ArrayList<Edge> graph[]=new ArrayList[n];
        insert(graph);
        boolean vis[]=new boolean[n];
        topo(graph,n);
        
        }
    
}
