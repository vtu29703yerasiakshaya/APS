class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] in = new int[n];
        int[] out = new int[n];

        for (int i = 0; i < trust.length; i++) {
            int u = trust[i][0];
            int v = trust[i][1];
            in[v - 1] = in[v - 1] + 1;
            out[u - 1] = out[u - 1] + 1;
        }
        for (int i = 0; i < n; i++) {
            if (in[i] == n - 1 && out[i] == 0)
                return i + 1;
        }

        return -1;
    }
}