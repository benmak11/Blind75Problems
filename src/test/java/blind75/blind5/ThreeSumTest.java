package blind75.blind5;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class ThreeSumTest {

    private ThreeSum sum = new ThreeSum();
    private int[] arr = new int[]{-1,0,1,2,-1,-4};

    @Test
    public void threeSum() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-1,-1,2));
        expected.add(Arrays.asList(-1,0,1));
        List<List<Integer>> result = sum.threeSum(arr);
        for (int j = 0; j < expected.size(); j++) {
            for (int i = 0; i < expected.get(j).size(); i++)
                assertEquals(expected.get(j).get(i), result.get(j).get(i));
        }
    }
}