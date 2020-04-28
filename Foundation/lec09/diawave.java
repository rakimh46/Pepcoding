//diagonal wave
class diawave{
    public static void diawave(int[][] arr) {              
        int mode = 0, it = 0, lower = 0; 
        for (int t = 0; t < (2 * arr[0].length - 1); t++) { 
            int t1 = t; 
            if (t1 >= arr[0].length) { 
                mode++; 
                t1 = arr[0].length- 1; 
                it--; 
                lower++; 
            } 
            else { 
                lower = 0; 
                it++; 
            } 
            for (int i = t1; i >= lower; i--) { 
                if ((t1 + mode) % 2 == 0) { 
                    System.out.print(arr[i][t1 + lower - i]+" "); 
                } 
                else { 
                    System.out.print(arr[t1 + lower - i][i]+" "); 
                } 
            } 
        } 
    } 
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};
        diawave(arr);             
    }
}