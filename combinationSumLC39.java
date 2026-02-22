class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> mylist =  new ArrayList<>();
        List<Integer> sublist=new ArrayList<>();
        int index=0;
        int sum=0;
        combination(mylist,sublist,candidates,target,sum,index);
        return(mylist);
    }
    public void combination(List<List<Integer>> mylist,List<Integer> sublist,int candidates[],int target,int sum,int index)
    {
        if(sum > target || index >= candidates.length)
        {
            return;
        }
        if(sum == target )
        {
            mylist.add(new ArrayList<>(sublist)); //We are making a separate copy of sublist
            return;
        }
        sublist.add(candidates[index]);
        combination(mylist,sublist,candidates,target,sum+candidates[index],index);
        sublist.remove(sublist.size() - 1);
        combination(mylist,sublist,candidates,target,sum,index+1);
    }
}
