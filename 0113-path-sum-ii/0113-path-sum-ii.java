class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>path=new ArrayList<>();
        dfs(root,targetSum,path,ans);
        return ans;
    }
    void dfs(TreeNode root,int targetSum,List<Integer> path,List<List<Integer>>ans){
        if(root==null)return;
        List<Integer>newPath=new ArrayList<>(path);
        newPath.add(root.val);
        if(root.left==null && root.right==null){
            if(targetSum==root.val)
            ans.add(newPath);
            return;
        }
        int val=targetSum-root.val;
        dfs(root.left,val,newPath,ans);
        dfs(root.right,val,newPath,ans);
    }
}