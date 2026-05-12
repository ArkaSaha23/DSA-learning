class Solution {
    public int minTime(int[] arr, int k) 
    {    
        int n=arr.length;
        if(k>n) return -1;                //if no of boards is less than number of painters
        
        int sum=0;
        for(int i=0;i<n;i++)                 //Time complexity = O(n)
        {
            sum = sum+arr[i];
        }
        
        int left=0;
        int right=sum;
        int ans=-1;

        //FINE MIDMAXBOARDS FROM 0 TO SUM
        while(left<=right)                       //Time complexity = O(log(Range) * n)..... n  coz of the function
        {
            int mid=left + (right-left)/2;
            
            /*IN ORDER TO DECREASE THE SEARCH SPACE WE HAVE TO FIND OUT WHICH ONE OF 
              THE MID VALUE IS VALID ANSWER AND WHICH IS NOT 
               - IF THE MID VALUE(MAXIMUM ALLOCATED BOARDS) IS VALID 
                   THEN REDUCE THE SEARCH BY MOVING LEFT SIDE
               - IF THE MID VALUE IS NOT VALID 
                   THEN REDUCE THE SEARCH BY MOVING RIGHT SIDE 
              */

            if(isValid(arr,n,k,mid))
            {
                ans=mid;
                right = mid -1;
            }
            else
            {
                left = mid +1;
            }
        }
        return ans;
    }
    public boolean isValid(int arr[],int n,int k,int midMaxBoard)    Time complexity = O(n)
    {
        int painterCount = 1;
        int boards=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] > midMaxBoard) return false;
            
            if(boards + arr[i] <= midMaxBoard){
                boards = boards + arr[i];
            }
            else
            {
                painterCount++;
                boards=arr[i];
            }
        }
        if(painterCount <= k) return true;
        else return false;
    }
}
