package ex2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3);
        Integer k = 5;
        Map<Tuple, Integer> kValues = kMethod(nums, k);
    }

    private static Map<Tuple, Integer> kMethod (List<Integer> nums, Integer k) {
        Map<Tuple, Integer> result = new HashMap<Tuple, Integer>();
        return result;
    }

}
