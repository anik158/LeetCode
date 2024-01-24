package e_contains_duplicate;

import java.util.HashSet;
import java.util.Set;

public class Main_217 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,17,2,9};
        System.out.println(containsDuplicate(numbers));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
