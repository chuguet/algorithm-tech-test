package ex2;

import ex1.Tuple;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 1, 2, 3, 4, 2, 4, 2, 1, 3, 7);
        Integer k = 5;
        List<Tuple> result = kMethodRecursive(nums, k, new HashSet<Integer>(), new ArrayList<Tuple>());
        result.forEach(System.out::println);
    }

    private static List<Tuple> kMethod(List<Integer> nums, Integer k) {
        List<Tuple> result = new ArrayList<Tuple>();
        Set<Integer> hashSet = new HashSet<Integer>();
        for (Integer num : nums) {
            if (hashSet.contains(k - num)) {
                result.add(new Tuple(num, k - num));
            }
            hashSet.add(num);
        }
        return result;
    }

    private static List<Tuple> kMethodRecursive(List<Integer> nums, Integer k, Set<Integer> hashSet, List<Tuple> result) {
        if (!nums.isEmpty()) {
            Integer num = nums.get(0);
            if (hashSet.contains(k - num)) {
                result.add(new Tuple(num, k - num));
            }
            hashSet.add(num);
            return kMethodRecursive(nums.subList(1, nums.size()), k, hashSet, result);
        } else {
            return result;
        }
    }

}
