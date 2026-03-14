class Solution {
    public int firstUniqueEven(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(num % 2==0 && noDuplicate(num,nums)){
                return num;
            }
        }
        return -1;
    }
    public boolean noDuplicate(int x,int nums[]){
        int c=0;
        for(int n:nums){
            if(n==x){
                c++;
            }
        }
        if(c>1){
            return false;
        }
        return true;
    }
}
