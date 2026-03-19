class Solution {
    public void moveZeroes(int[] nums) {
        int zc = 0,k=0;
        for(int i : nums){
            if(i != 0)  nums[k++]   = i;
            else    zc++;
        }
        while(zc!=0){
            nums[k++] = 0;
            zc--;
        }
    }
}