import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int arr[] = new int[number];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        for(int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i]);
        }
    }
}
