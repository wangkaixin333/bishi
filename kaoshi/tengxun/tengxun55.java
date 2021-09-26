package tengxun;

import org.junit.Test;

import java.util.stack;

public class erchashu {
    @Test
    public void mainf
    int[][] nums = new int[7][21;
for(
    int imoik
    nums.length;i++)f
if(

    isCousins(root, nums[i][0], nums[i][j))t
return

    back(root, nums[i][0], nums[i][1]);

    int xpar, xdep, ypar, ydep;
    TreeNode left;
    TreeNode right;
    TreeNode templeft;
    TreeNode tempright;

    public boolean isCousins(TreeNode root, int x, int y)f

    dfs(root.left，1，x, y，root.val);

    dfs(root.right，1，x，y，root.val);
return(xpar !=ypar)&&(xdep ==ydep);

    public void dfs(TreeNode node, int dep, int x, int y, int par)f
if(node ==null)

    {
        return;
        if (node.val = x) {
            xpar = par;
            xdep = dep;
            jelse if (node.val == y) {
                ypar = pars ydep = dep;
                jelse f
                dfs(node.left，dep + 1，x，y，node.val); dfs(node.right，dep + 1，x, y，node.val)

                public TreeNode back (TreeNode node,int x, int y)
                if (node == null) {
                    return null;
                    jelse if (node.left.val == x) {
                        left = node.left;
                        templeft = node;
                        jelse if (node.right.val = x) {
                            left = node.right;
                            templeft node:
                            jelse if (node.left.val == y) {
                                right = node.left;
                                tempright = node;
                                jelse if (node.right.val == y) {
                                    right = node.right;
                                    tempright = node;
                                    f else{
                                        dfs(node.left，x，y); dfs(node.right，x，y)
                                        templeft = right;
                                        tempright = left;
                                        return node;
                                    }
