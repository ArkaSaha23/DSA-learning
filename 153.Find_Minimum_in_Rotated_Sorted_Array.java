class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;

        int left = 0;
        int right = n-1;
        int ans = Integer.MAX_VALUE;

        //IF A SORTED HALF IF FOUND TAKE THAT MINIMUM VALUE(EITHER ARR[MID] OR ARR[LEFT]) AND UPDATE THE LEFT AND RIOGHT POINTER...
        //BESICALLY REMOVE THAT HALF FROM THE SERACH SPACE
        while(left <= right)
        {
            int mid = left + (right - left)/2;
            
            if(nums[left] <= nums[mid])
            {
                ans = Math.min(ans,nums[left]);
                left = mid+1;
            }
            else if(nums[mid] <= nums[right])
            {
                ans= Math.min(ans,nums[mid]);
                right = mid -1;               
            }
        }
        return ans;
    }
}
