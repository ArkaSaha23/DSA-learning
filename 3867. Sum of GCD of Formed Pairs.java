class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int mxi[]=new int[n];
        int prefixGcd[] = new int[n];
        mxi[0]=nums[0];
        for(int i=1;i<n;i++){
            mxi[i]=Math.max(mxi[i-1],nums[i]);
        }
        for(int i=0;i<n;i++){
            prefixGcd[i] = gcd(nums[i], mxi[i]);
        }
        Arrays.sort(prefixGcd);
        long sum=0;
        for(int i=0;i<n/2;i++){
            sum=sum+gcd(prefixGcd[i],prefixGcd[n-i-1]);
        }
        return sum;
    }
    public int gcd(int a,int b){
        if(a<b){
            int temp=a;
            a=b;
            b=temp;
        }
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;  
    }
}
