class Solution {
    public int trap(int[] height) {
        //use the two pointer method to calc prefix and suffix
        //Time complexity = O(n)
        //space complexity = O(1) 
        int n=height.length;
        int leftMax=0,rightMax=0;
        int left = 0 , right = n-1;
        int result =0;
        
        while(left < right){
            leftMax = Math.max(leftMax , height[left]);
            rightMax = Math.max(rightMax , height[right]); 
            
            if(leftMax < rightMax){
                result+= leftMax - height[left];
                left++;
            }else{
                result+= rightMax - height[right];
                right--;
            }
        }

        return result;
    }
}
