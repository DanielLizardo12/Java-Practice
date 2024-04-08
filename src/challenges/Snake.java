package challenges;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/**
 * Snake description.
 *
 * @author Daniel
 * @version 06/04/2024
 */
public class Snake {

  private int height;
  private int width;
  private int x;
  private int y;

  private int snakeSize = 3;

  public Snake(int height, int width, int x, int y) {
    this.height = height;
    this.width = width;
    this.x = x;
    this.y = y;
  }

  public static void main(String[] args) {
    Snake snake = new Snake(2,2,0,0);
    snake.snakeGame();
  }

  public void snakeGame() {
    int[][] board = new int[height][width];
    board[x][y] = 1;
    LinkedList<int[]> snake = new LinkedList<>();
    snake.addFirst(new int[]{x,y});
    board = generateRandomFood(board, height, width);
    printBoard(board);

    Scanner scanner = new Scanner(System.in);

    while (scanner.hasNext()) {

      switch (scanner.nextLine()) {
        case "l":
          if (y - 1 < 0) {
            y = width - 1;
          } else {
            y--;
          }
          break;
        case "r":
          if (y + 1 >= width) {
            y = 0;
          } else {
            y++;
          }
          break;
        case "u":
          if (x - 1 < 0) {
            x = height - 1;
          } else {
            x--;
          }
          break;
        case "d":
          if (x + 1 >= height) {
            x = 0;
          } else {
            x++;
          }
          break;
      }

      if (board[x][y] == 1) {
        System.out.println("YOU LOST! HAHAHAHAHHA");
        return;
      }

      if (board[x][y] == 2) {
        snakeSize++;

        if (win(board)) return;

        generateRandomFood(board, height, width);
      }

      if (snake.size() >= snakeSize) {
        board[snake.getLast()[0]][snake.getLast()[1]] = 0;
        snake.removeLast();
      }

      snake.addFirst(new int[]{x, y});
      board[snake.getFirst()[0]][snake.getFirst()[1]] = 1;
      printBoard(board);
    }

  }

  private int[][] generateRandomFood(int[][] board, int height, int width) {
    Random random = new Random();
    int randomHeight = random.nextInt(height);
    int randomWidth = random.nextInt(width);

    if (board[randomHeight][randomWidth] != 0) {
      return generateRandomFood(board, height, width);
    }

    board[randomHeight][randomWidth] = 2;
    return board;
  }

  private boolean win(int[][] board) {
    for (int[] row : board) {
      for (int element : row) {
        if (element == 0) return false;
        }
      }

    System.out.println("you won!");
    return true;
  }


  private static void printBoard(int[][] board) {
    for (int[] row : board) {
      for (int element : row) {
        System.out.print(element + " ");
      }
      System.out.println();
    }
  }


}
