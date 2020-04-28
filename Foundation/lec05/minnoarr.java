import java.util.*;
class minnoarr{

public static void input(final int[] arr) {
        final Scanner scn = new Scanner(System.in);
        System.out.print("array= ");
        for (int i = 0; i < arr.length; i++) {

            arr[i] = scn.nextInt();
        }
        
    }

    public static void minimum(final int[] arr) {
        final Scanner scn = new Scanner(System.in);
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (min > arr[i]) {

                min = arr[i];
            }
        }
        System.out.print("Minimum= " + min);
    }

    public static void main(final String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Size of array= ");
        int size=scn.nextInt();

        final int[] arr = new int[size];
input(arr);
minimum(arr);

}

}