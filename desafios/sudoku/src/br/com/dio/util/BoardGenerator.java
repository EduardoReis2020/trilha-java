package br.com.dio.util;

import java.util.Random;

public class BoardGenerator extends BoardChallengeCreator{

    private static final int SIZE = 9;

    public String generateFullBoard() {
        int[][] board = new int[SIZE][SIZE];
        fillBoard(board, 0, 0);
        return toCustomFormat(board);
    }

    private boolean fillBoard(int[][] board, int row, int col) {
        if (row == SIZE) return true;
        int nextRow = (col == SIZE - 1) ? row + 1 : row;
        int nextCol = (col + 1) % SIZE;
        int[] numbers = shuffledNumbers();
        for (int num : numbers) {
            if (isValid(board, row, col, num)) {
                board[row][col] = num;
                if (fillBoard(board, nextRow, nextCol)) return true;
                board[row][col] = 0;
            }
        }
        return false;
    }

    private int[] shuffledNumbers() {
        int[] nums = new int[SIZE];
        for (int i = 0; i < SIZE; i++) nums[i] = i + 1;
        Random rand = new Random();
        for (int i = SIZE - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return nums;
    }

    private boolean isValid(int[][] board, int row, int col, int num) {
        for (int i = 0; i < SIZE; i++) {
            if (board[row][i] == num || board[i][col] == num) return false;
        }
        int boxRow = (row / 3) * 3, boxCol = (col / 3) * 3;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[boxRow + i][boxCol + j] == num) return false;
        return true;
    }

    private String toCustomFormat(int[][] board) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                sb.append(i)
                  .append(",")
                  .append(j)
                  .append("=")
                  .append(board[i][j])
                  .append(",true");
                if (!(i == SIZE - 1 && j == SIZE - 1)) {
                    sb.append(", ");
                }
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public static void main(String[] args) {
        BoardGenerator generator = new BoardGenerator();
        String board = generator.generateFullBoard();
        System.out.println(board);
    }
}