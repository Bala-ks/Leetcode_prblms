class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(nums, 0, new ArrayList<>());
        return res;
    }

    void backtrack(int[] nums, int start, List<Integer> temp){
        if(!res.contains(temp))
        res.add(new ArrayList<>(temp));

        for(int i = start; i < nums.length; i++){
            temp.add(nums[i]);          
            backtrack(nums, i + 1, temp);
            temp.remove(temp.size()-1); 
        }
    }
}