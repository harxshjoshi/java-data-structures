package com.harxsh;

import java.util.Arrays;

public class _2DArrays {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '-';
            }
        }

        char[][] board2 = new char[][] {
            new char[] {'0', '-', '-'},
            new char[] {'0', '-', '-'},
            new char[] {'0', '-', '-'},
        };

        board[0][0] = '0';
        board[1][0] = '0';
        board[2][0] = '0';

        System.out.println(Arrays.deepToString(board));
        System.out.println(Arrays.deepToString(board2));
    }
}
