//direct variation of Allocated Minimum Pages

class Solution {
    public int aggressiveCows(int[] stalls, int k) 
    {
        Arrays.sort(stalls); //time complexity - O(nlogn)
        int n = stalls.length;
        
        int left=1;
        int right = stalls[n-1] - stalls[0];
        int ans=-1;
        
        while(left <= right)            //time complexity = O(log(Range) * n)
        {             
            int mid = left + (right - left)/2;

            if(isPossible(stalls,n,k,mid))
            {
                ans=mid;
                left = mid+1;
            }
            else
            {
                right = mid-1;
            }
        }
        return ans;
    }
    public boolean isPossible(int stalls[],int n,int k,int maxAllowedDistance)   //log(n)
    { 
       int cowNo=1;
       int lastStallPlaced = stalls[0];
       
       for(int i=1;i<n;i++)
       {
           if( (stalls[i] - lastStallPlaced) >= maxAllowedDistance)
           {
               lastStallPlaced = stalls[i];
               cowNo++;
           }
           if(cowNo == k){
               return true;
           }
       }
       return false;
    }
}
