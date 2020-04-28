//graph
//display
//print path from one vertex to another vertex
//shortest and largest weight in th graph from one vertex to another vertex
//ceil and floor
import java.util.*;
public class GraphLecTwo {
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

    //shortest and largest weight in th graph from one vertex to another vertex
    static int mincost=Integer.MAX_VALUE;
    static int maxcost=Integer.MIN_VALUE;
    static String minpath = "";
    static String maxpath = "";

    public static void LongestAndShortestPaths(ArrayList<ArrayList<edge>> graph,int s,int d,boolean[] visited,String psf,int csf) {
        if(s==d){
            psf=psf+d;
            if(csf < mincost){
                mincost = csf;
                minpath = psf;
            }
            if(csf > maxcost){
                maxcost = csf;
                maxpath = psf;
            }
            return; 
        }
        visited[ s ] = true;
        
        for (int e = 0; e < graph.get(s).size(); e++) {
            edge ce = graph.get(s).get(e);
            if (visited[ce.nbr] == false) {
                LongestAndShortestPaths(graph, ce.nbr, d, visited,psf + s,csf + ce.wt);
                
            }
        }
        visited[s]=false;
    }

    //ceil and floor
    static int CeilCost=Integer.MAX_VALUE;
    static int FloorCost=Integer.MIN_VALUE;
    static String cPath="";
    static String fPath="";
    public static void CeilAndFloorPaths(ArrayList<ArrayList<edge>> graph,int s,int d,boolean[] visited,String psf,int csf,int factor) {
        if(s==d){
            psf=psf+d;
        if(csf >factor){//(function mai fator euqals ayega)
            if(CeilCost > csf){
                CeilCost = csf;
                cPath = psf;
            }
        }
        if(csf <factor){  //(function mai fator euqals ayega) 
            if(csf > FloorCost){
                FloorCost = csf;
                fPath = psf;
            }
        }    
            return; 
        }
        visited[ s ] = true;
        
        for (int e = 0; e < graph.get(s).size(); e++) {
            edge ce = graph.get(s).get(e);
            if (visited[ce.nbr] == false) {
                CeilAndFloorPaths(graph, ce.nbr, d, visited,psf + s,csf + ce.wt,factor);
            }
        }
        visited[s]=false;
    }

    public static void kthLargestPath(ArrayList<ArrayList<edge>> graph,boolean[] visited,int s,int d,int k){
        FloorCost = Integer.MIN_VALUE;
        int factor =Integer.MAX_VALUE;
        for(int i=0;i<k;i++){
            FloorCost=Integer.MIN_VALUE;
            CeilAndFloorPaths(graph, s, d, visited, "", 0, factor);
            factor=FloorCost;
        }
        System.out.println(fPath+" @ "+ FloorCost);
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
        // LongestAndShortestPaths(graph, 0, 6,visited,"",0);
        // System.out.println(maxpath+" @ "+maxcost+" and "+minpath+" @ "+mincost);
        // CeilAndFloorPaths(graph, 0, 6, visited, "", 0,45);
        // System.out.println("C="+CeilCost+" F="+FloorCost); //(function mai fator euqals ayega)
        kthLargestPath(graph, visited, 0, 6,2);
    }

}