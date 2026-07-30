class Solution {
    public int search(int[] nums, int target) 
    {
        int lb=0;
        int ub=nums.length - 1 ;
        while(lb <= ub)
        {
            int mid=lb+(ub-lb)/2;
            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[lb] <= nums[mid])                    //check if the left subarray is sorted or not
            {                                                     
                if(nums[lb] <= target && target <= nums[mid])      //if it is, then check if the mid value lies btw the 'srt' index and 'mid' index
                {                                                        //if it is ,update the upper boundary to mid-1
                    ub = mid - 1;
                }
                else                                                    //if not, update the lower boundary to mid+1
                {
                    lb = mid + 1;
                }
            }
            else if(nums[mid] <= nums[ub])                   //check if the right subarray is sorted or not
            {
                if(nums[mid] <= target && target <= nums[ub])     //if it is, then check if the mid value lies btw the 'mid' index and 'end' index
                {
                    lb = mid +1;                                         //if it is ,update the lower boundary to mid+1
                }
                else
                {
                    ub = mid - 1;                                        //if not, update the upper boundary to mid-1
                }
            }
        }
        return -1;
    }
}
