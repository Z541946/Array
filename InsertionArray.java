import java.util.*;
public class InsertionArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int arr[] = new int[number1];
        int arr2[] = new int[number2];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = scanner.nextInt();
        }
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if (arr[i] == arr2[j]) {
                    //System.out.println(arr[i]);
                    ans = arr[i];
                }
            }
        }
        System.out.println(ans);
    }
}
// Foreach
// public static String[] intersectForeach(String[] arr1, String[] arr2){
//     ArrayList<String> result = new ArrayList<>();
//     for(int i = 0; i < arr1.length; i++){
//         for(int r = 0; r < arr2.length; r++){
//             if(arr1[i].equals(arr2[r]))
//                 result.add(arr1[i]);
//         }
//     }
//     return result.toArray(new String[0]);
// }
// HashSet
// public static String[] intersectHashSet(String[] arr1, String[] arr2){
//     HashSet<String> set = new HashSet<>(Arrays.asList(arr1));
//     set.retainAll(Arrays.asList(arr2));
//     return set.toArray(new String[0]);
// }