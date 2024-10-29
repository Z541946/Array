import java.util.*;

public class RemoveSpecificElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int number = scanner.nextInt();
        System.out.print("Enter the number: ");
        int number2 = scanner.nextInt();
        int arr[] = new int[number];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] != number2) {
        //         System.out.print(arr[i]+" ");
        //     }
        // }
        ArrayList<Integer> result = removeElement(arr,number2);
        System.out.println(result);
        
    }

    public static ArrayList<Integer> removeElement(int[] arr, int number2) {
        ArrayList<Integer> l1 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != number2) {
                l1.add(arr[i]);
            }
        }
        return l1;
    }
}


