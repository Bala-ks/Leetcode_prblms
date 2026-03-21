class Solution {
    List<List<Integer>> res = new ArrayList<>();
    int n;
    public List<List<Integer>> subsets(int[] nums) {
        n = nums.length;
        backtrack(nums, 0, new ArrayList<>());
        return res;
    }

    void backtrack(int[] nums, int start, List<Integer> temp){
        res.add(new ArrayList<>(temp));

        for(int i = start; i < n;i++){
            temp.add(nums[i]);          
            backtrack(nums, i + 1, temp);
            temp.remove(temp.size()-1); 
        }
    }
}