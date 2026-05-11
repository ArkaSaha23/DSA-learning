/*
k = NO. OF STUDENTS
n = NO. OF BOOKS
arr[i] = NO. OF PAGES IN Ith BOOK

We are not binary searching on the array.
We are binary searching on the answer.
Suppose:  mid = 113
Meaning : “Can we allocate books so that no student gets more than 113 pages?”
If YES → maybe smaller answer exists ( left search)
If NO → we need bigger answer (right search)
This YES/NO pattern is why binary search works.
*/

class Solution {
    public int findPages(int[] arr, int k) {
        int sum=0;
        int n=arr.length;
        
        if(k>n)                    //IF THE NO OF BOOKS IS LESS THAN THE NO OF STUDENTS
        {
            return -1;
        }
        
        int ans=-1;
        for(int i=0;i<n;i++){       //CALCULATE THE TOTAL SUM OF PAGES TO GET THE RANGE FROM 0 TO SUM , Time complexity = O(n)
            sum+=arr[i];
        }
       
        int left = 0;
        int right = sum;
        
        while(left <= right){                        // Time complexity = O(log(n) * n)....n because of function used
            int mid = left +(right-left)/2;
            
            /*IN ORDER TO DECREASE THE SEARCH SPACE WE HAVE TO FIND OUT WHICH ONE OF 
              THE MID VALUE IS VALID ANSWER AND WHICH IS NOT 
               - IF THE MID VALUE(MAXIMUM ALLOCATED PAGES) IS VALID 
                   THEN REDUCE THE SEARCH BY MOVING LEFT SIDE
               - IF THE MID VALUE IS NOT VALID 
                   THEN REDUCE THE SEARCH BY MOVING RIGHT SIDE 
            */

            if(isValid(arr,n,k,mid)) {
                ans=mid;
                right = mid-1;
            } 
            else {
                left = mid +1;
            }
        }
        return ans;
    } 
    boolean isValid(int arr[],int n,int k,int midMaxPage)      //Time complexity = O(n)
    {
        int studentCount=1;
        int pages=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] > midMaxPage)            //IF ANY VALUE OF arr[i] IS GREATER THAN MID (arr[i] = 6 , mid = 4)
            {
                return false;
            }
            if( pages + arr[i] <= midMaxPage)
            {
                pages+=arr[i];
            }
            else
            {
                studentCount++;
                pages=arr[i];
            }
        }
        if(studentCount <= k )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
