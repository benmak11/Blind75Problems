package blind75.blind4;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContainerWithMostWaterTest {

    private ContainerWithMostWater container = new ContainerWithMostWater();
    private int[] arr = new int[]{1,8,6,2,5,4,8,3,7};

    @Test
    public void maxArea() {
        int expected = 49;
        int result = container.maxArea(arr);
        assertEquals(expected, result);
    }

    @Test
    public void maxArea2() {
        int[] arr = new int[]{1,1};
        int expected = 1;
        int result = container.maxArea(arr);
        assertEquals(expected, result);
    }

    @Test
    public void maxArea3() {
        int[] arr = new int[]{4,3,2,1,4};
        int expected = 16;
        int result = container.maxArea(arr);
        assertEquals(expected, result);
    }
}