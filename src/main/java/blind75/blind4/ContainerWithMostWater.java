package blind75.blind4;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int result = 0;
        int l = 0;
        int r = height.length - 1;
        while (l < r) {
            result = Math.max(result, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return result;
    }
}
