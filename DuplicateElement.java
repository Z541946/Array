import java.util.*;
public class DuplicateElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int arr[] = new int[number];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
           if (i == 0 || arr[i]!=arr[i-1]) {
            System.out.print(arr[i]+" ");
           }
        }
    }
}
