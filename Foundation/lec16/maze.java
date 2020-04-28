// its like a maze in matrix
// destination from (0,0) to (2,2)
import java.util.*;
class maze{

    public static int mazepath(int sr,int sc,int er,int ec,String path) {
        
        if(sc==ec && sr==er){
            System.out.println(path);
            return 1;
        }
        int ans=0;
        if(sc+1<=ec){
            //horizontal
            ans += mazepath(sr,sc+1,er,ec,path+'h');
        }
        if(sr+1<=er){
            //horizontal
            ans += mazepath(sr+1,sc,er,ec,path+'v');
        }
        return ans;

    }
    public static void main(String[] args) {
        System.out.print(mazepath(0,0,2,2,""));

        
    }
}