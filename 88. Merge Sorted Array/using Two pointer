class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;                 //store the index of the last element of nums1[] 
        int j = n - 1;                 //store the index of the last element of nums2[] 
        int k = m + n - 1;             //store the last index of nums1[] 

        while (i>=0 && j >= 0) {         
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while(j>=0){                    //if there are element in nums2[] which are not added in nums1[],this wont be hppening in nums1[] as there are already smaller sorted elements
            nums1[k--] = nums2[j--];
        }
    }
}
