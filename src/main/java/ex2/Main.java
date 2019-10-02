package ex2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,1,2,3,4,2,4,2,1,3,7);
        Integer k = 5;
        Set<Integer> hashSet = kMethodRecursive(nums, k, new HashSet<Integer>());
    }

    private static Set<Integer> kMethod (List<Integer> nums, Integer k) {
        Set<Integer> hashSet = new HashSet<Integer>();
        for (Integer num : nums) {
            if (hashSet.contains(k-num)) {
                System.out.println("Pair with given sum " + k + " is (" + num + ", " + (k - num) + ")");
            }
            hashSet.add(num);
        }

        return hashSet;
    }

    private static Set<Integer> kMethodRecursive (List<Integer> nums, Integer k, Set<Integer> hashSet) {
        if(!nums.isEmpty()) {
            Integer num = nums.get(0);
            if (hashSet.contains(k-num)) {
                System.out.println("Pair with given sum " + k + " is (" + num + ", " + (k - num) + ")");
            }
            hashSet.add(num);
            return kMethodRecursive(nums.subList(1, nums.size()), k, hashSet);
        } else  {
            return hashSet;
        }
    }

}
