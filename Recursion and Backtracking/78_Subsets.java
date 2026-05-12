class Solution {
    public List<List<Integer>> subsets(int[] nums) 
    {
        int n=nums.length;
        
        List<Integer> subset = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        getSubsets(result,subset,nums,0);
        return result;
    }
    public void getSubsets(List<List<Integer>> result, List<Integer> subset,int nums[],int index)
    {
        if(nums.length == index)
        {
            result.add(new ArrayList<>(subset));
            return;   

        }
        subset.add(nums[index]);
        getSubsets(result,subset,nums,index+1);

        subset.remove(subset.size() - 1);         //backtracking step
        getSubsets(result,subset,nums,index+1);
    }
}
