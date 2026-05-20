class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        int subsets=1<<n;         //equivalent to 2^n
        List<List<Integer>> list= new ArrayList<>();
        
        for(int i = 0 ; i < subsets ; i++){
            List<Integer> sublist = new ArrayList<>();
            
            for(int j = 0 ; j < n ; j++){
                if( (i & (1 << j)) != 0 ){
                    sublist.add(nums[j]);
                }
            }
            
            list.add(sublist);
        }
        return list;
    }
}
