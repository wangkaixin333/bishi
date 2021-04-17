package niukelianxi;

public class qianxubianli {
    private int preIndex = 0;
    private int inIndex = 0;
    private int postIndex = 0;
    public int[][] threeOrders (TreeNode root) {
        // write code here
        int size = getNums(root);
        int[][] res = new int[3][size];
        preOrder(root,res);
        inOrder(root,res);
        postOrder(root,res);
        return res;
    }

    public int getNums(TreeNode root){
        if(root == null) return 0;
        return 1 + getNums(root.left) + getNums(root.right);
    }

    public void preOrder(TreeNode root,int[][] res){
        if(root == null) return;
        res[0][preIndex++] = root.val;
        preOrder(root.left,res);
        preOrder(root.right,res);
    }

    public void inOrder(TreeNode root,int[][] res){
        if(root == null) return;
        inOrder(root.left,res);
        res[1][inIndex++] = root.val;
        inOrder(root.right,res);
    }

    public void postOrder(TreeNode root,int[][] res){
        if(root == null) return;
        postOrder(root.left,res);
        postOrder(root.right,res);
        res[2][postIndex++] = root.val;
    }
}
