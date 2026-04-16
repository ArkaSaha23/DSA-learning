class Solution {
    public void sortColors(int[] nums)
    {
        int count0=0,count1=0,count2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0) count0+=1;
            else if(nums[i]==1) count1+=1;
            else if(nums[i]==2) count2+=1;
        }
        int i=0;
        while(i<count0){
            nums[i++]=0;
        }
        while(i<(count0+count1)){
            nums[i++]=1;
        }
        while(i<(count0+count1+count2)){
            nums[i++]=2;
        }
        
    }
}
