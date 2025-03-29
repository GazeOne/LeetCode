package interview150;

public class _11MaxArea {

    public int maxArea(int[] height) {

        int n = height.length;
        int start = 0;
        int end = n - 1;
        int maxArea = 0;

        while (start < end) {
            int heightStart = height[start];
            int heightEnd = height[end];
            int area = Math.min(heightStart, heightEnd) * (end - start);
            maxArea = Math.max(maxArea, area);
            if (heightStart < heightEnd) {
                start++;
            } else {
                end--;
            }
        }

        return maxArea;

    }

}
