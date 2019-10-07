package ex2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3);
        Integer k = 5;
        KComplementary kComplementary = KComplementary.getInstance();
        List<Tuple> result = kComplementary.kMethodRecursive(nums, k, new HashSet<Integer>(), new ArrayList<Tuple>());
        result.forEach(System.out::println);
    }

}
