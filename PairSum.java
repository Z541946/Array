import java.util.*;
public class PairSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = scanner.nextInt();
        int arr[] = new int[number];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if (arr[i]+arr[j] == sum) {
                    System.out.println("true");
                }else{
                    System.out.println("false");
                }
            }
        }
    }
}
