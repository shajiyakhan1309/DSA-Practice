public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
     }
     class Solution {
        
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            
        }
    }
    
    
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
                idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new TreeNode(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
        public static void postOrder(Node root){
                if(root == null){
                    System.out.print(-1+" ");
                    return;
                }
                postOrder(root.left);
                postOrder(root.right);
                System.out.print(root.data+" ");
            }
    }
    public static void main(String args[]){
       int root[] = {6,2,8,0,4,7,9,null,null,3,5};
        int p = 2;
        int q = 8;
    
        BinaryTree tree = new BinaryTree();
        Node root = tree.lowestCommonAncestor(nodes);
        System.out.println(root.data);
        postOrder(root);
    }