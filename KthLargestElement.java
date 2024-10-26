import java.util.*;

public class KthLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int k = scanner.nextInt();
       int arr[] = new int[number];
       //int arr[] = {3,2,1,5,6,4};
       //int s = arr.length;
       //System.out.println(s);
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 1; i <=k; i++){
            int element = arr[number-i];
            System.out.print(element+" ");
        }
        //System.out.println(arr);
        //int element = arr[number-k];
        // int element = arr.length-k;
        // System.out.println(element);
    }
}
