package com.dl.zz.leetcode;

/**
 *  根据 百度百科 ，生命游戏，简称为生命，是英国数学家约翰·何顿·康威在 1970 年发明的细胞自动机。
 *
 * 给定一个包含 m × n 个格子的面板，每一个格子都可以看成是一个细胞。每个细胞都具有一个初始状态：1 即为活细胞（live），或 0 即为死细胞（dead）。每个细胞与其八个相邻位置（水平，垂直，对角线）的细胞都遵循以下四条生存定律：
 *
 * 如果活细胞周围八个位置的活细胞数少于两个，则该位置活细胞死亡；
 * 如果活细胞周围八个位置有两个或三个活细胞，则该位置活细胞仍然存活；
 * 如果活细胞周围八个位置有超过三个活细胞，则该位置活细胞死亡；
 * 如果死细胞周围正好有三个活细胞，则该位置死细胞复活；
 * 根据当前状态，写一个函数来计算面板上所有细胞的下一个（一次更新后的）状态。下一个状态是通过将上述规则同时应用于当前状态下的每个细胞所形成的，其中细胞的出生和死亡是同时发生的。
 *
 *  
 *
 * 示例：
 *
 * 输入：
 * [
 *   [0,1,0],
 *   [0,0,1],
 *   [1,1,1],
 *   [0,0,0]
 * ]
 * 输出：
 * [
 *   [0,0,0],
 *   [1,0,1],
 *   [0,1,1],
 *   [0,1,0]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/game-of-life
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Question289 {


    public void gameOfLife(int[][] board) {

        int[][] lifes = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                find(board, i, j, lifes);
            }

        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = lifes[i][j];
            }
        }

    }

    // 暴力查找
    private void find(int[][] board, int i, int j, int[][] lifes) {
        int row = board.length;
        int col = board[0].length;
        int ctn = 0;
        // 下方
        if (i < row - 1 && board[i + 1][j] == 1) {
            ctn++;
        }
        // 上方
        if (i > 0 && board[i - 1][j] == 1) {
            ctn++;
        }
        // 左方
        if (j > 0 && board[i][j - 1] == 1) {
            ctn++;
        }
        // 右方
        if (j < col - 1 && board[i][j + 1] == 1) {
            ctn++;
        }
        // 左上方
        if (i > 0 && j > 0 && board[i - 1][j - 1] == 1) {
            ctn++;
        }
        // 右上方
        if (i > 0 && j < col - 1 && board[i - 1][j + 1] == 1) {
            ctn++;
        }
        // 左下方
        if (i < row - 1 && j > 0 && board[i + 1][j - 1] == 1) {
            ctn++;
        }
        // 右下方
        if (i < row - 1 && j < col - 1 && board[i + 1][j + 1] == 1) {
            ctn++;
        }
        
        
        if (ctn < 2 || ctn > 3) {
            lifes[i][j] = 0;
        } else if(ctn==2){
            lifes[i][j] = board[i][j];
        }else if (ctn==3){
            lifes[i][j] = 1;
        }
    }
    
}
