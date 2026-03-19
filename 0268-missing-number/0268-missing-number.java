class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length,tot = n,arr = 0;
        for(int i=0;i<n;i++){
            arr+=nums[i];
            tot+=i;
        }
        return tot-arr;
    }
}