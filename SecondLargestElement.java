import java.util.*;
public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int arr[] = new int[number];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int element = arr[number-2];
        System.out.println(element);
    }
}
