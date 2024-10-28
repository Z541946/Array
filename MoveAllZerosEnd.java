import java.util.*;
public class MoveAllZerosEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int arr[] = new int[number];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == 0) {
                for(int j = i+1; j < arr.length; j++){
                    if (arr[j] != 0) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                }
            }
            System.out.print(arr[i]+" ");
        }
    }
}
