package e_two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(arr[i], i);
        }

        throw new IllegalArgumentException("No two elements sum up to the target");
    }

    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 11};
        int target = 14;
        int[] result = twoSum(arr, target);

        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }

//    public static int[] twoSum(int[] arr, int target){
//        int[] arr1 = new int[2];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length ; j++) {
//                    if((arr[i]+arr[j])==target){
//                        arr1[0] = i;
//                        arr1[1] = j;
//                    }
//            }
//        }
//
//        return arr1;
//    }
//    public static void main(String[] args) {
//
//        int[] res = twoSum(new int[]{8,3,11,6},14);
//        System.out.println(Arrays.toString(res));
//    }
}
