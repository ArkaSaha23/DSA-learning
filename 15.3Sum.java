class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> n= new ArrayList<>();
        int l=nums.length;

        for(int i=0;i<l-1;i++)
        {
            if (i > 0 && nums[i] == nums[i - 1]) 
            {
                continue;
            }
            int j=i+1;
            int k=l-1;
            while(j < k)
            {
                int total=nums[i] + nums[j] + nums[k];
                if(total == 0)
                {
                     n.add(nums[i]);
                    n.add(nums[j]);
                    n.add(nums[k]);
                    res.add(new ArrayList<>(n));
                    n.clear();
                    //res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1])
                    {
                        j++;
                    }
                }
                else if(total < 0)
                {
                    j++;
                }
                else
                {
                    k--;
                }
            }
        }
        return res;
    }
}
