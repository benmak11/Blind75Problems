package blind75.blind1;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {

    private TwoSum twoSum = new TwoSum();
    private int[] testArray = new int[]{2,7,11,15};
    private int target = 9;

    @Test
    public void twoSum() {
        int[] expected = new int[]{1, 0};
        int[] result = twoSum.twoSum(testArray, target);
        assertArrayEquals(expected, result);
    }
}