class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        
        getSubset(result,subset,nums,0);
        
        return result;
    }
    public void getSubset(List<List<Integer>> result,List<Integer> subset , int nums[] ,int index)
    {
        if(nums.length == index){
            result.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[index]);
        getSubset(result,subset,nums,index+1);
        
        subset.remove(subset.size() -1);
        int i = index+1;
        while(i < nums.length && nums[i] == nums[index]){
            i++;
        }
        getSubset(result,subset,nums,i);
    }
}
