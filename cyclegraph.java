import java.util.ArrayList;

public class cyclegraph {
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
    graph[0].add(new Edge(0,1));
    graph[0].add(new Edge(0,2));
    
    
    graph[1].add(new Edge(1,3));
    graph[1].add(new Edge(1,0));

   
    graph[2].add(new Edge(2,4));
    graph[2].add(new Edge(2,0));

    graph[3].add(new Edge(3,1));
    graph[3].add(new Edge(3,4));
     graph[3].add(new Edge(3,5));

      graph[4].add(new Edge(4,2));
      graph[4].add(new Edge(4,3));
      graph[4].add(new Edge(4,5));

      graph[5].add(new Edge(5,6));
      graph[5].add(new Edge(5,3));
      graph[5].add(new Edge(5,4));

    graph[6].add(new Edge(6,5));



      }
      public static boolean dfs(ArrayList<Edge>graph[],boolean vis[],int curr,boolean rec[]){
        vis[curr]=true;
        rec[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(rec[e.des]){
                return true;
            }
            if(vis[e.des]==false){
                if(dfs(graph, vis, e.des, rec)){
                    return true;
                }
            }
        }
       rec[curr]=false;
       return false;
 }
    
    


        
 
    
    public static void main(String []ars){
        int n=7;
        ArrayList<Edge> graph[]=new ArrayList[n];
        insert(graph);
        boolean vis[]=new boolean[n];
        boolean rec[]=new boolean[n];
        for(int i=0;i<n;i++){

        
        boolean is=dfs(graph, vis, 0,rec);
        if(is){
            System.out.println(is);
            break;
        }
        
        }
    
}
}