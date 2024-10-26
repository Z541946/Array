import java.util.*;
public class arraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int arr[] = new int[number];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
       
        // for(int i = 0; i < arr.length-1; i++){
        //     if (arr[i] < arr[i+1]) {
        //         System.out.println("true");
        //     }else{
        //         System.out.println("false");
        //     }
        // }
        System.out.println(isSorted(arr));
    }
    public static boolean isSorted(int [] a){
        for(int i = 0; i < a.length-1; i++){
                if (a[i] > a[i+1]) {
                    return false;
                }
            }
            return true;
    }
}
// public void rotate(int[] nums, int k){
        //     k %= nums.length;
        //     reverse(nums,k,length-1);
        // }