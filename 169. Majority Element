/*
- User Moore Voting algorithm if frequency of majority element is > n/2.
- The core idea is vote cancellation. 
- Think of it as a battle: every time we see a different element, it "cancels out" one occurrence of the current candidate. 
- Because the majority element appears more than half the time, it will mathematically "outlast" all other elements and remain the candidate by the end of the first pass */

class Solution {
    public int majorityElement(int[] nums) {
       int freq=0,ans=0,n=nums.length;   
       for(int i=0;i<n;i++){
        if(freq == 0) {
            ans = nums[i];
        }
        //now check for the frequenty of current 'ans' element
        if(ans == nums[i]){
            freq++;
        }else{
            freq--;
        }
       }

       int count=0;            //verification if ans is more than n/2
       for(int num : nums){
        if(num == ans){
            count++;
        }
       }
       if(count > n/2) return ans;
       else return -1;
    }
}

