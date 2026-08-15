class Solution {

    private static final int[][] directions = {{-1,0} , {1,0}, {0,1},{0,-1}};
    public int maxAreaOfIsland(int[][] grid) {
        int RoL = grid.length;
        int CoL = grid[0].length;
        int area = 0;
        for (int i = 0; i<RoL;i++){
            for (int j = 0; j<CoL;j++){
                if (grid[i][j] == 1){
                    area = Math.max(area,dfs(i, j, grid));
                }
            }
        } 
        return area;
    }
    public int dfs(int r, int c, int[][] grid){
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0){
            return 0;
        }
        grid[r][c] = 0;
        int res = 1;
        for (int[] dir : directions){
            res += dfs(r + dir[0], c + dir[1], grid);        
        }
        return res;
    }
}
