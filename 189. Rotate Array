class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public void reverse(int arr[],int srt,int end){
        while(srt<end){
            int temp=arr[srt];
            arr[srt]=arr[end];
            arr[end]=temp;
            srt++;
            end--;
        }
    }
}
