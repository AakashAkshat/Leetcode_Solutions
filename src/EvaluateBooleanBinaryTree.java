public class EvaluateBooleanBinaryTree {
    class Solution {
        public boolean evaluateTree(TreeNode root) {
            if(root.val < 2)
                return root.val == 1;

            // OR
            if(root.val == 2)
                return evaluateTree(root.left) || evaluateTree(root.right);

            // AND
            return evaluateTree(root.left) && evaluateTree(root.right);
        }
    }
}
