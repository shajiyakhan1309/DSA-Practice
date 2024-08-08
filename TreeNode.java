public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            // Implement the logic for finding the lowest common ancestor here
        }
    }
    
    static class BinaryTree {
        static int idx = -1;
        public static TreeNode buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            TreeNode newNode = new TreeNode(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    
        public static void postOrder(TreeNode root) {
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val + " ");
        }
    }
    
    public static void main(String args[]) {
        int nodes[] = {6, 2, 8, 0, 4, 7, 9, -1, -1, 3, 5};
        int p = 2;
        int q = 8;
    
        BinaryTree tree = new BinaryTree();
        TreeNode root = tree.buildTree(nodes);
        System.out.println(root.val);
        BinaryTree.postOrder(root);
    }
    