// post recurssion
import java.util.ArrayList;
class rat{
    public static ArrayList<String> maze(int sr,int sc,int er,int ec) {
        if(sc==ec && sr==er){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> myans = new ArrayList<>();
        for(int i=1;sc+i<=ec;i++){
            ArrayList<String> recans=maze(sr,sc+i,er,ec);
            for(String str : recans){
                myans.add("h"+i+str);
            }
        }
        for(int i=1;sr+i<=er;i++){
            ArrayList<String> recans=maze(sr+i,sc,er,ec);
            for(String str : recans){
                myans.add("v"+i+str);
            }
        }
        for(int i=1;sc+i<=ec && sr+i<=er;i++){
            ArrayList<String> recans=maze(sr+i,sc+i,er,ec);
            for(String str : recans){
                myans.add("d"+i+str);
            }
        }
        return myans;

    }
    public static void main(String[] args) {
       System.out.print(maze(0,0,2,2));    
    }   
}    