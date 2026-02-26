class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max,area=0;
        while(left < right)
        {
            if(height[left] > height[right])
            {
                max=(right-left)*height[right];
                right--;
            }
            else if(height[left] < height[right])
            {
                max=(right-left)*height[left];
                left++;
            }
            else
            {
                max=(right-left) * height[left];
                left++;
                right--;
            }
            if(area<max)
            {
                area=max;
            }
        }
        return area;
    }
}
