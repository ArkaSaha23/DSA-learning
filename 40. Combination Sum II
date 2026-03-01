class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> mylist =  new ArrayList<>();
        List<Integer> sublist=new ArrayList<>();
        Arrays.sort(candidates);
        int index=0;
        int sum=0;
        combination(mylist,sublist,candidates,target,sum,index);
        return(mylist);
    }
    public void combination(List<List<Integer>> mylist,List<Integer> sublist,int candidates[],int target,int sum,int index)
    {
        if(sum > target )
        {
            return;
        }
        if(sum == target )
        {
            mylist.add(new ArrayList<>(sublist)); //We are making a separate copy of sublist
            return;
        }
        for(int i=index;i<candidates.length;i++)
        {
            if(i>index && (candidates[i]==candidates[i-1]))//avoid duplicates.
            {
                continue;
            }
            sublist.add(candidates[i]);
            combination(mylist,sublist,candidates,target,sum+candidates[i],i+1);
            sublist.remove(sublist.size() - 1);
        }
    }
}
