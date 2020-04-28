//Hamiltonian Path and Hamiltonian circle
//Component
//bfs
import java.util.*;
public class GraphLecThree {
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

    //Hamiltonian Path and Hamiltonian circle
    public static void HamiltonianPathAndCircle(ArrayList<ArrayList<edge>> graph,boolean[] visited,int s,ArrayList<Integer> Path,int os){
        if( Path.size() == graph.size() - 1){
            Path.add(s);

            for(int i=0;i<Path.size(); i++){
                System.out.print(Path.get(i)+" ");
            }
            boolean isCycle = false;
            for(int e=0; e<graph.get(s).size();e++){
                edge ce = graph.get(s).get(e);
                if( ce.nbr == os ){
                    isCycle = true;
                    break;
                }
            }
            if(isCycle){
                System.out.println(".");
            }
            System.out.println();
            Path.remove(Path.size()-1);
            return;
        }
        visited[s] = true;
        Path.add(s);
            for(int e=0; e<graph.get(s).size();e++){
                edge ce = graph.get(s).get(e);
                if( visited[ce.nbr]== false){
                    HamiltonianPathAndCircle(graph, visited, ce.nbr, Path, os);
                }
            }
            Path.remove(Path.size() -1);
            visited[s] = false;      
    }

    //Component
    public static void getComponent(ArrayList<ArrayList<edge>> graph,ArrayList<Integer> comp,boolean[] visited,int s) {
        visited[s] = true;
        comp.add(s);
        for(int e=0;e < graph.get(s).size(); e++ ){
            edge ce = graph.get(s).get(e);
            if(visited[ce.nbr] == false ){
                getComponent(graph, comp, visited, ce.nbr);
            }

        }
        
    }
    public static int ConnectedComponent(ArrayList<ArrayList<edge>> graph) {
        boolean[] visited = new boolean[graph.size()];
        int count = 0;
        for(int v = 0; v < graph.size(); v++) { 
            if(visited[v] == false) { 
                count++;
                ArrayList<Integer> singleComp = new ArrayList<>(); 
                getComponent(graph,singleComp,visited,v);
                System.out.println(singleComp); 
            } 
        } 
        return count;
    } 

    //bfs
    static class bfsHelper{
        int vtx;
        String path;
        int cost;
        bfsHelper( int v, String p, int c ){
            this.vtx = v; this.path = p; this.cost = c;
        }
    }
    public static void bfsTraversal(ArrayList<ArrayList<edge>> graph, int s){
        Queue<bfsHelper> qu = new LinkedList<>();
        boolean[] visited = new boolean[graph.size()];
        qu.add( new bfsHelper(s, ""+s+" -> ",0) );
        visited[0] = true;
        while( qu.size() > 0 ){
            // remove
            bfsHelper cv = qu.remove();
            // mark
            // if( visited[cv.vtx] ){
            //     continue;
            // }else{
            //     visited[cv.vtx] = true;
            // }
            // work
            System.out.println( cv.path +" @ "+cv.cost );
            // add nbrs
            for( int e =  0 ; e < graph.get(cv.vtx).size() ; e++ ){
                edge ce = graph.get(cv.vtx).get(e);
                if( visited[ce.nbr] == false ){
                    visited[ce.nbr] = true;
                    qu.add( new bfsHelper( ce.nbr, cv.path + ce.nbr+" -> ",cv.cost+ce.wt) );
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
        addEdge(graph, 2, 5, 10);  //Hamiltonian Path and Hamiltonian circle
        //addEdge(graph, 3, 4, 2);
        addEdge(graph, 4, 5, 3);
        addEdge(graph, 5, 6, 3);
        addEdge(graph, 4, 6, 8);
        //display(graph);
        //boolean[] visited = new boolean[graph.size()];
        //ArrayList<Integer> Path=new ArrayList<>();
        //HamiltonianPathAndCircle(graph, visited, 0, Path, 0);
        //System.out.print(ConnectedComponent(graph));
        bfsTraversal(graph,0);
    }

}