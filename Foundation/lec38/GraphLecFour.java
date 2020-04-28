//minimum and maximum priority queue
import java.util.*;
public class GraphLecFour {
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
    public static void display(ArrayList<ArrayList<edge>> graph) {
        for (int i = 0; i < graph.size(); i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < graph.get(i).size(); j++) {
                edge ce = graph.get(i).get(j);
                System.out.print("[" + ce.nbr + " @ " + ce.wt + "], ");
            }
            System.out.println();
        }
    }

    //minimum and maximum priority queue
    static class bfsHelper implements Comparable<bfsHelper>{
        int vtx;
        String path;
        int cost;

        bfsHelper( int v, String p, int c ){
            this.vtx = v; this.path = p; this.cost = c;
        }    
        public int compareTo( bfsHelper other){
            return this.cost - other.cost;

            }
        }
    public static void dijkstra(ArrayList<ArrayList<edge>> graph,int s) {
        PriorityQueue<bfsHelper> pq = new PriorityQueue<>();
        //PriorityQueue<bfsHelper> pq = new PriorityQueue<>(Collections reverseOrder());  maximum priority Queue
        boolean[] visited = new boolean[graph.size()];
        bfsHelper root = new bfsHelper(s, ""+s, 0);
        pq.add(root);
        while(pq.size()>0){
            //remove
            bfsHelper cv = pq.remove();
            //mark
            if(visited[cv.vtx] == true){
                continue;
            }else{
                visited[cv.vtx] = true;
            }
            //work
            System.out.println( cv.path + " @ "+ cv.cost);
            for( int i=0; i<graph.get(cv.vtx).size();i++){
                edge ce= graph.get(cv.vtx).get(i);
                if( visited[ce.nbr] == false){
                    bfsHelper newvtx= new bfsHelper(ce.nbr, cv.path +"->"+ce.nbr, cv.cost + ce.wt);
                    pq.add(newvtx);
                }
            }
        }
        
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
        dijkstra(graph, 0);
    }

}