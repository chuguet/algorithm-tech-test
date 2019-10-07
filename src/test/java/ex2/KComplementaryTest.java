package ex2;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class KComplementaryTest {

    @org.junit.Test
    public void kComplementary() {
        List<Integer> nums = Arrays.asList(1, 1, 2, 3, 4, 2, 4, 2, 1, 3, 7);
        Integer k = 5;
        KComplementary kComplementary = KComplementary.getInstance();
        List<Tuple> result = kComplementary.kMethodRecursive(nums, k, new HashSet<Integer>(), new ArrayList<Tuple>());
        Assert.assertEquals(Arrays.asList(new Tuple(3, 2), new Tuple(4, 1), new Tuple(2, 3), new Tuple(4, 1), new Tuple(2, 3), new Tuple(1, 4), new Tuple(3, 2)), result);
    }

    @org.junit.Test
    public void kComplementaryRecursive() {
        List<Integer> nums = Arrays.asList(1, 1, 2, 3, 4, 2, 4, 2, 1, 3, 7);
        Integer k = 5;
        KComplementary kComplementary = KComplementary.getInstance();
        List<Tuple> result = kComplementary.kMethod(nums, k);
        Assert.assertEquals(Arrays.asList(new Tuple(3, 2), new Tuple(4, 1), new Tuple(2, 3), new Tuple(4, 1), new Tuple(2, 3), new Tuple(1, 4), new Tuple(3, 2)), result);
    }

}
