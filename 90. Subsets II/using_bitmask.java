class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);         //sort is very imp
        int n=nums.length;
        int sublists = (1 << n);   //equivalent to 2^n
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0 ; i < sublists ;i++){
            List<Integer> sublist = new ArrayList<>();

            for(int j = 0 ; j < n ; j++){
                if( (i & (1<<j)) != 0){
                    sublist.add(nums[j]);
                }
            }

            if(!list.contains(sublist)){
                list.add(sublist);
            }
        }
        return list;
    }
}
