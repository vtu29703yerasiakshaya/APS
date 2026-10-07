class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int total = 0;
        int leftSum = 0;
        for (int i : nums) {
            total = total + i;
        }       
        int[] ans = new int[n];        
        for (int i = 0; i < n; i++) {
            int rs = (total - leftSum - nums[i]) - ((n - i - 1) * nums[i]);
            int ls = (i * nums[i]) - leftSum;
            ans[i] = ls + rs;
            leftSum = leftSum + nums[i];
        }    
        return ans;
    }
}
