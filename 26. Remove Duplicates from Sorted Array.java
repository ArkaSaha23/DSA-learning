class Solution {
    public int removeDuplicates(int[] nums) {
        int c=0;
        HashSet<Integer> element =new HashSet<>();
        for(int num : nums)
        {
            if(!element.contains(num))
            {
                nums[c]=num;
                c++;
                element.add(num);
            }
        }
        return c;  
    }
}
