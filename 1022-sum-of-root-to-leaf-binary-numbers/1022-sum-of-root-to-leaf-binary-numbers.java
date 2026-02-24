class Solution {

    public int sumRootToLeaf(TreeNode root) {
        return helper(root, 0);
    }

    public int helper(TreeNode node, int num) {
        if (node == null) return 0;
        num = num * 2 + node.val;


        if (node.left == null && node.right == null) {
            return num;
        }
        
        return helper(node.left, num) + helper(node.right, num);
    }
}