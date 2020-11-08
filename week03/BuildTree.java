/**
 * 构建二叉树
 * */
class BuildTree{

    private  Map<Integer,Integer> inIdxMap;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int len = preorder.length;

        inIdxMap = new HashMap<>();
        for(int i=0;i<len;i++){
            inIdxMap.put(inorder[i],i);
        }

        return subTree(preorder,inorder,0,len-1,0,len-1);
    }
    private  TreeNode subTree(int[] preorder, int[] inorder, int preStart, int preEnd, int inStart, int inEnd ) {
        if(preStart>preEnd){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int rootIdx=inIdxMap.get(preorder[preStart]);
        int leftLen = rootIdx-inStart;
        root.left=subTree(preorder,inorder,preStart+1,preStart+leftLen,inStart,rootIdx-1);
        root.right=subTree(preorder,inorder,preStart+leftLen+1,preEnd,rootIdx+1,inEnd);
        return root;
    }
}