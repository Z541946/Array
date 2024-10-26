import java.util.Scanner;
import java.util.*;
public class maxAndMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int arr[] = new int[number];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        // int max = arr[0];
        // int min = arr[0];
        // for(int i = 0; i < arr.length; i++){
        //     if (arr[i]>max) {
        //         max = arr[i];
        //     }
        //    // System.out.println(max);
        // }
        // for(int i = 0; i < arr.length; i++){
        //     if (arr[i]< min) {
        //         min = arr[i];
        //     }
        //    // System.out.println(max);
        // }
        // System.out.println(max);
        // System.out.println(min);
       Arrays.sort(arr);
        int min = arr[0];
        System.out.println(min);
        int max = arr[arr.length-1];
        System.out.println(max);

    }

}
