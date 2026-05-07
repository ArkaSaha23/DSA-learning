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
            else if(nums[lb] <= nums[mid])                            //CHECK IF THE LEFT SUBARRAY IS SORTED OR NOT
            {                                                     
                if(nums[lb] <= target && target <= nums[mid])         //IF IT IS, THEN CHECK IF THE MID VALUE LIES BTW THE 'SRT' INDEX AND 'MID' INDEX
                {                                                     //IF IT IS ,UPDATE THE UPPER BOUNDARY TO MID-1
                    ub = mid - 1;
                }
                else                                                  //IF NOT, UPDATE THE LOWER BOUNDARY TO MID+1
                {
                    lb = mid + 1;
                }
            }
            else if(nums[mid] <= nums[ub])                             //CHECK IF THE RIGHT SUBARRAY IS SORTED OR NOT
            {
                if(nums[mid] <= target && target <= nums[ub])          //IF IT IS, THEN CHECK IF THE MID VALUE LIES BTW THE 'MID' INDEX AND 'END' INDEX
                {
                    lb = mid +1;                                       //IF IT IS ,UPDATE THE LOWER BOUNDARY TO MID+1
                }
                else
                {
                    ub = mid - 1;                                      //IF NOT, UPDATE THE UPPER BOUNDARY TO MID-1
                }
            }
        }
        return -1;
    }
}
