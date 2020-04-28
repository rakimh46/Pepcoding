//prims algo
//Spinning treeand minimum spinning tree
import java.util.*;
public class PrismAlgo {
    static class edge{
        int src;  // source    src
        int nbr;  // neighbour nbr
        int wt; // weight    wt
        edge(int v1, int v2, int wt) {
            this.src = v1;
            this.nbr = v2;
            this.wt = wt;
        }
    }
    public static void addEdge(final ArrayList<ArrayList<edge>> graph,int src,int nbr, int wt) {
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

    //prims algo
    //Spinning treeand minimum spinning tree
    static class primsHelper implements Comparable<primsHelper>{
        int vtx;
        int par;
        int wt;
        primsHelper( int v, int p, int dis ){
            this.vtx = v; this.par = p; this.wt = dis;
        }    
        public int compareTo( primsHelper other){
            return this.wt - other.wt;
            }
    }
    public static void primsMST(ArrayList<ArrayList<edge>> graph) {
        ArrayList<ArrayList<edge>> mst = new ArrayList<>();
        for (int i = 0; i <= 6; i++) {
            mst.add(new ArrayList<edge>());
        }
        PriorityQueue<primsHelper> pq = new PriorityQueue<>();
        primsHelper rootNode = new primsHelper(2, -1, 0);
        pq.add(rootNode);
        boolean[] visited = new boolean[graph.size()];
        while(pq.size()>0){
            primsHelper cv=pq.remove();
            //mark
            if(visited[cv.vtx]==true){
                continue;
            }else{
                visited[cv.vtx] = true;
            }
            //work
            if(cv.par != -1){
                addEdge(mst, cv.vtx, cv.par, cv.wt);
            }
          // add nbrs
        for( int i=0; i<graph.get(cv.vtx).size();i++ ){
            edge ce= graph.get(cv.vtx).get(i);
            if( visited[ce.nbr] == false){
                primsHelper newvtx = new primsHelper(ce.nbr, cv.vtx, cv.wt);
                pq.add( newvtx); 
            }
        }
    }
        display(mst);   
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
        addEdge(graph, 2, 5, 10);
        addEdge(graph, 3, 4, 2);
        addEdge(graph, 4, 5, 3);
        addEdge(graph, 5, 6, 3);
        addEdge(graph, 4, 6, 8);
        addEdge(graph, 0, 3, 30);
        display(graph);
        primsMST(graph);
    }    

}