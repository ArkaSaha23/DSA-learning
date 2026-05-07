class Solution 
{
    public int peakIndexInMountainArray(int[] nums) 
    {
        int n=nums.length;

        //THE ANSWER CAN NEVER BE THE STARTIG AND THE ENEDING INDEX AS THE LENGTH OF THE ARRAY IS >= 3 (GIVEN)
        int left = 1; 
        int right = n-2;

        while(left <= right)
        {
            int mid = left +(right-left)/2;
           
            if(nums[mid-1] < nums[mid] && nums[mid+1] < nums[mid])   //IF MID IS GREATER THE THE PREVIOUS AND THE NEXT ELEMENT
            {
                return mid;
            }

            //REDUCE THE SEARCH SPACE
            else if(nums[mid] > nums[mid-1])               //MID LIES IN THE INCREASING SLOPE SO UPDATE LEFT
            {
                left = mid +1;
            }  
            else                                         //MID LIES IN THE DECREASING SLOPE SO UPDATE RIGHT
            {     
                right = mid -1;
            }    
        }
        return -1;
    }
}
