
import java.util.*;
public class  graphweight {
    static class Edge{
        int src;
        int des;
        int weight;
        Edge(int s,int d,int w){
            this.src=s;
            this.des=d;
            this.weight=w;
        }
    }
public static void insert(ArrayList<Edge> graph[]){
    for(int i=0;i<graph.length;i++){
        graph[i]=new ArrayList<Edge>();

    }
    graph[0].add(new Edge(0,2,10));
    
    graph[1].add(new Edge(1,3,1));
    graph[1].add(new Edge(1,2,9));

    graph[2].add(new Edge(2,3,8));
    graph[2].add(new Edge(2,1,6));
    graph[2].add(new Edge(2,0,5));

    graph[3].add(new Edge(3,1,4));
    graph[1].add(new Edge(3,2,-10));

}
    
    public static void main(String []ars){
        int n=4;
        ArrayList<Edge> graph[]=new ArrayList[n];
        insert(graph);
        for(int i=0;i<graph[2].size();i++){
            Edge e=graph[2].get(i);
            System.out.println(e.des+","+e.weight);
        }


    }
}