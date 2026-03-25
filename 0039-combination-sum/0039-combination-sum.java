

class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] num, int tar)
     {
        Arrays.sort(num);
        backtrack(num, 0, new ArrayList<>(),tar);
        return res;
    }

    void backtrack(int[] nums, int start, List<Integer> temp,int tar){
        if(tar == 0)   res.add(new ArrayList<>(temp));
        for(int i = start; i < nums.length; i++){
            if(tar-nums[i] < 0 )    break;
            temp.add(nums[i]);          
            backtrack(nums, i, temp,tar-nums[i]);
            temp.remove(temp.size()-1); 
        }
    }
}