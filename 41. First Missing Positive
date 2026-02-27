class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int i=1;
        for(int num:nums){
            if(num >= 0){
                if(num > i) return i;
                else if(num == i){
                    i++;
                } 
            }
        }    
        return i;
    }
}
