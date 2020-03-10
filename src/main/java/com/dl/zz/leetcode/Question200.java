package com.dl.zz.leetcode;

/**
 * leetcode 200
 *
 * 给定一个由 '1'（陆地）和 '0'（水）组成的的二维网格，计算岛屿的数量。一个岛被水包围，
 * 并且它是通过水平方向或垂直方向上相邻的陆地连接而成的。你可以假设网格的四个边均被水包围。
 *
 * 示例 1:
 *
 * 输入:
 * 11110
 * 11010
 * 11000
 * 00000
 *
 * 输出: 1
 * 示例 2:
 *
 * 输入:
 * 11000
 * 11000
 * 00100
 * 00011
 *
 * 输出: 3
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/number-of-islands
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Question200 {
    public int numIslands(char[][] grid) {
        if(grid.length == 0) {
            return 0;
        }
        // 访问标记
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int sum = 0;
        
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                sum += dfs(grid, visited, i, j) > 0 ? 1 : 0;
            }
        }
        return sum;
    }

    private int dfs(char[][] grid, boolean[][] visited, int i, int j) {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
            return 0;
        }
        if(visited[i][j]) {
            return 0;
        }
        if(grid[i][j] == '0') {
            return 0;
        }
        visited[i][j] = true;
        // 四个方向递归
        return 1 + dfs(grid, visited, i-1, j)
                + dfs(grid, visited, i+1, j)
                + dfs(grid, visited, i, j-1)
                + dfs(grid, visited, i, j+1);
    }
    
}