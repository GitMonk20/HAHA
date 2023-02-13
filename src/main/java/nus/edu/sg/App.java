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
