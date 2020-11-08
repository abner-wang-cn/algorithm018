/**
 * 二叉树最近公共祖先
 * */
class SameParentNode{
    TreeNode ans;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root,p,q);
        return ans;
    }
    private boolean dfs(TreeNode root,TreeNode p, TreeNode q){
        if(root==null){
            return false;
        }
        boolean leftRes = dfs(root.left, p,q);
        boolean rightRes = dfs(root.right,p,q);
        if((leftRes&&rightRes) || ((root==p||root==q)&&(leftRes||rightRes))){
            ans=root;
        }
        return leftRes||rightRes||(root==p)||(root==q);
    }
}