package nus.edu.sg;

import java.util.Scanner;

public class TicTacToe {
  static Scanner sc = new Scanner(System.in);
  static char[][] board = new char[3][3];
  static char turn = 'X';

  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        board[i][j] = ' ';
      }
    }

    while (true) {
      printBoard();
      takeTurn();
      if (isWinner()) {
        System.out.println(turn + " wins!");
        break;
      } else if (isDraw()) {
        System.out.println("It's a draw.");
        break;
      }
      toggleTurn();
    }
  }

  static void printBoard() {
    System.out.println("-------------");
    for (int i = 0; i < 3; i++) {
      System.out.print("| ");
      for (int j = 0; j < 3; j++) {
        System.out.print(board[i][j] + " | ");
      }
      System.out.println();
      System.out.println("-------------");
    }
  }

  static void takeTurn() {
    System.out.print("Player " + turn + ", enter your move (row[1-3] column[1-3]): ");
    int row = sc.nextInt() - 1;
    int col = sc.nextInt() - 1;
    while (board[row][col] != ' ') {
      System.out.println("Move already made. Try again.");
      System.out.print("Player " + turn + ", enter your move (row[1-3] column[1-3]): ");
      row = sc.nextInt() - 1;
      col = sc.nextInt() - 1;
    }
    board[row][col] = turn;
  }

  static boolean isWinner() {
    for (int i = 0; i < 3; i++) {
      if (board[i][0] == turn && board[i][1] == turn && board[i][2] == turn) {
        return true;
      }
      if (board[0][i] == turn && board[1][i] == turn && board[2][i] == turn) {
        return true;
      }
    }
    if (board[0][0] == turn && board[1][1] == turn && board[2][2] == turn) {
      return true;
    }
    if (board[0][2] == turn && board[1][1] == turn && board[2][0] == turn) {
      return true;
    }
    return false;
  }

  static boolean isDraw() {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (board[i][j] == ' ') {
          return false;
        }
      }

    }
}
