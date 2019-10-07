package ex2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KComplementary {

    private static KComplementary kComplementary;

    public KComplementary() {

    }

    public static KComplementary getInstance() {
        if (kComplementary == null) {
            kComplementary = new KComplementary();
        }
        return kComplementary;
    }

    public List<Tuple> kMethod(List<Integer> nums, Integer k) {
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

    public List<Tuple> kMethodRecursive(List<Integer> nums, Integer k, Set<Integer> hashSet, List<Tuple> result) {
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
