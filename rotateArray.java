import java.util.*;
import java.util.Collections;
public class rotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Integer arr[] = new Integer[number];
        int k = scanner.nextInt();
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        List<Integer> list = Arrays.asList(arr);
        Collections.rotate(list, k);

        // Convert the list back to an array (optional, here we just print the list)
        System.out.println(list);
    }
}
// public void rotate(int[] nums, int k) { // k = 2
//     k %= nums.length;
//     // {0,1,2,3,4}

//     reverse(nums, 0, nums.length - 1); // Reverse the whole Array
//     // {4,3,2,1,0}

//     reverse(nums, 0, k - 1); // Reverse first part (4,3 -> 3,4)
//     // {3,4,2,1,0}

//     reverse(nums, k, nums.length - 1); //Reverse second part (2,1,0 -> 0,1,2)
//     // {3,4,0,1,2}
// }

// public void reverse(int[] nums, int start, int end) {
//     while (start < end) {
//         int temp = nums[start];
//         nums[start] = nums[end];
//         nums[end] = temp;
//         start++;
//         end--;
//     }
// }