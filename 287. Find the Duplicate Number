this approach is similar to hair turtle method of linked list
class Solution {
    public int findDuplicate(int[] nums) {
        int slow=nums[0],fast=nums[0];

        //initially the slow and fast pointer will be at the same place so use do while loop
        do{
            slow=nums[slow];         //move slow by 1
            fast=nums[nums[fast]];   //move fast by 2

        }while(slow != fast);

        slow=nums[0];               //move the slow to index 0th position
        while(slow != fast){
            slow=nums[slow];  
            fast=nums[fast];
        }
        return slow;
    }
}
