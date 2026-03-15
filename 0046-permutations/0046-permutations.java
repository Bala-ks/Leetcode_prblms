import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), new HashSet<>(), result);
        return result;
    }

    public  void backtrack(int[] nums, List<Integer> current, Set<Integer> visited, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int num : nums) {
            if (visited.contains(num)) continue;

            visited.add(num);
            current.add(num);

            backtrack(nums, current, visited, result);

            current.remove(current.size() - 1);
            visited.remove(num);
        }
    }
}