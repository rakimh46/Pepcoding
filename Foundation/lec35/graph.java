//graph
//display
//path checking 0 t0 6 (valid or not)
//print path from one vertex to another vertex
import java.util.*;
public class graph {
    static class edge{
        int src;  // source    src
        int nbr;  // neighbour nbr
        int wt; // weight    wt
        edge(final int v1, final int v2, final int wt) {
            this.src = v1;
            this.nbr = v2;
            this.wt = wt;
        }
    }
    public static void addEdge(final ArrayList<ArrayList<edge>> graph,int src,int nbr, final int wt) {
        graph.get(src).add(new edge(src, nbr, wt));
        graph.get(nbr).add(new edge(nbr, src, wt));
    }

    //display
    public static void display(final ArrayList<ArrayList<edge>> graph) {
        for (int i = 0; i < graph.size(); i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < graph.get(i).size(); j++) {
                edge ce = graph.get(i).get(j);
                System.out.print("[" + ce.nbr + " @ " + ce.wt + "], ");
            }
            System.out.println();
        }
    }

    //path checking 0 t0 6 (valid or not)
    public static boolean hasPath(ArrayList<ArrayList<edge>> graph,int s,int d,boolean[] visited) {

        if (s == d) {
            return true;
        }
        visited[s] = true;

        for (int e = 0; e < graph.get(s).size(); e++) {
            edge ce = graph.get(s).get(e);
            if (visited[ce.nbr] == false) {
                boolean recAns = hasPath(graph, ce.nbr, d, visited);
                if (recAns)
                    return true;
            }
        }
        return false;
    }

    //print path from one vertex to another vertex
    public static void PrintAllPaths(ArrayList<ArrayList<edge>> graph,int s,int d,boolean[] visited,String psf) {
        if(s==d){
            psf = psf + d;
            System.out.println(psf);
            return; 
        }
        visited[ s ] = true;
        for (int e = 0; e < graph.get(s).size(); e++) {
            edge ce = graph.get(s).get(e);
            if (visited[ce.nbr] == false) {
                PrintAllPaths(graph, ce.nbr, d, visited, psf + s+" -> ");
            }
        }
        visited[s]=false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<edge>> graph = new ArrayList<>();
        for (int i = 0; i <= 6; i++) {
            graph.add(new ArrayList<edge>());
        }
        addEdge(graph, 0, 1, 10);
        addEdge(graph, 0, 3, 40);
        addEdge(graph, 1, 2, 10);
        addEdge(graph, 2, 3, 10);
        addEdge(graph, 3, 4, 2);
        addEdge(graph, 4, 5, 3);
        addEdge(graph, 5, 6, 3);
        addEdge(graph, 4, 6, 8);
        //display(graph);
        boolean[] visited = new boolean[graph.size()];
        //System.out.println(hasPath(graph,0,6,visited));
        PrintAllPaths(graph, 0, 6,visited,"");

    }
}