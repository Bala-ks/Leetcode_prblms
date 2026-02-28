class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0)   return;
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }
        int k=0;
        for(int i=m;i<m+n;i++)  nums1[i] = nums2[k++];
        Arrays.sort(nums1);
        
    }
}