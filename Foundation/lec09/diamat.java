//diagonal matrix
class diawave{
    public static void wave(int[][] arr) {         
        for (int gap = 0; gap < arr[0].length; gap++) {
            for (int i = gap, j = 0; i >= 0 && j < arr[0].length; i--, j++){
               System.out.print(arr[i][j]+" "); 
            }   
         }
         for (int gap = 1; gap < arr.length; gap++) {
         for (int i = arr.length-1, j = gap; i >= 0 && j < arr[0].length; i--, j++) {
            System.out.print(arr[i][j]+" "); 
         }  
      }
    } 
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};
        wave(arr);             
    }
}