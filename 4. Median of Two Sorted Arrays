class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int m=nums1.length;  
        int n=nums2.length;  
        int arr3[]=new int[m+n];
        int c=0,d=0,e=0;
        while(c<m && d< n)
        {
            if(nums1[c] < nums2[d])
            {
                arr3[e++]=nums1[c++];
            }
            else
            {
                arr3[e++]=nums2[d++];
            }
        }
        while(c<m)
        {
            arr3[e++]=nums1[c++];
        }
        while(d<n)
        {
            arr3[e++]=nums2[d++];
        }
        //display(arr3);
        double M;
        if((arr3.length)%2==1)
        {
            M=arr3[(m+n-1)/2];
            System.out.println("hello");
            System.out.println(m+n);
        }
        else
        {
            M=(arr3[((m+n)/2)-1]  +  arr3[((m+n)/2)]) / 2.0;
        }
        return((M));
    }
}
