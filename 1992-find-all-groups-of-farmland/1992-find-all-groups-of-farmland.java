class Solution {
    int mr, mc;
    void dfs(int[][] land, int r, int c) {
        if (r < 0 || c < 0 || r >= land.length || c >= land[0].length || land[r][c] == 0) return;
        land[r][c] = 0;
        mr = Math.max(mr, r);
        mc = Math.max(mc, c);
        dfs(land, r + 1, c);
        dfs(land, r, c + 1);
    }

    public int[][] findFarmland(int[][] land) {
        int n = land.length, m = land[0].length;
        List<int[]> ans = new ArrayList<>();
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                if (land[r][c] == 1) {
                    mr = r;
                    mc = c;
                    dfs(land, r, c);
                    ans.add(new int[]{r, c, mr, mc});
                }
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}  