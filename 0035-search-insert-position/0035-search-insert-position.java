class Solution {
    public int searchInsert(int[] nums, int target) {
        int temp = Arrays.binarySearch(nums, target);
        return  (temp>=0) ? temp : Math.abs(temp)-1;
    }
}