class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>result=new ArrayList<>();
        if(root==null)
        return result;
        else
        {
            postorder(root,result);
            return result;
        }
        
    }
    void postorder(TreeNode root,List<Integer>result)
    {
        if(root!=null)
        {
            postorder(root.left,result);
            postorder(root.right,result);
            result.add(root.val);
        }
    }
}