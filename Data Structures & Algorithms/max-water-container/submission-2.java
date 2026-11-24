class Solution {
    public int maxArea(int[] heights) {
        int area = 0;
        int i = 0;
        int j = heights.length - 1;
        while (i < j) {
            int temp = (j - i) * Math.min(heights[i], heights[j]);
            if (temp > area) {
                area = temp;
            }
            if (heights[i] < heights[j]) {
                i++;
            } else {
                j--;
            }
        }
        return area;
    }
}
