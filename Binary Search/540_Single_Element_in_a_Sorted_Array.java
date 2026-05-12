class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int left = 0;
        int right = n-1;

        //SINGLE ELEMENT ARRAY
        if(n==1){    
            return nums[0];
        }

        while( left <= right)
        {
            int mid = left +(right-left)/2;

            if(mid == 0 && nums[0] != nums[1])           //EDGE CASE WHEN FIRST ELEMENT IS SINGLE ELEMENT
            {
                return nums[0];
            } 
            if(mid == n-1 && nums[n-1] != nums[n-2])     //EDGE CASE WHEN LAST ELEMENT IS SINGLE ELEMENT
            {
                return nums[n-1];
            }
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1])
            {
                return nums[mid];
            }

            //reduce the search space
            if(mid % 2==0)                               //EVEN NUMBER OF LEFT AND RIGHT HALVES OF MID
            {
                if(nums[mid] == nums[mid-1])             //SINGLE ELEMENT IS ON THE LEFT SIDE,(UPDATE RIGHT)
                {
                    right = mid-1;
                }
                else                                     //SINGLE ELEMENT IS ON THE RIGHT SIDE(UPDATE LEFT)
                {
                    left = mid +1;
                }
            }
            else if( mid % 2 != 0)                       //ODD NUMBER OF LEFT AND RIGHT HALVES OF MID
            {
                if(nums[mid] == nums[mid-1])            //SINGLE ELEMENT IS ON THE RIGHT SIDE(UPDATE LEFT)
                {
                    left = mid +1;   
                }
                else                                    //SINGLE ELEMENT IS ON THE LEFT SIDE (UPDATE RIGHT)
                {
                    right = mid-1;
                }
            }
        }
        return -1;
    }
}
