package ba.bitcamp.TicTacToe;
 
import java.util.Scanner;
/**
 * 
 * @author Zeljko Miljevic
 *
 */
public class TicTacToe {

	public static void main(String[] args) {
		boolean temp = true;
		int sizeOfBoard = 0;

		char[][] matrix;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Tic Tac Toe game!");
		System.out.println("Press ENTER to continue");

		String str = input.nextLine();
		System.out.println("Enter the size of the matrix: ");
		sizeOfBoard = input.nextInt();
		matrix = new char[sizeOfBoard][sizeOfBoard];
		Matrix(matrix);
		output(matrix);
		while (true) {
			temp = X(matrix);
			if (temp == true) {
				System.err.println("Congratulations, player X wins");
				break;
			} else {
				output(matrix);
			}
			temp = O(matrix);
			if (temp == true) {
				System.err.println("Congratulations, player O wins");
				break;
			} else {
				output(matrix);
			}
		}

	}
/**
 * ROWS
 * @param matrix
 * @param row
 * @param a
 * @return
 */
	public static boolean Rows(char matrix[][], int row, char a) {
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[row][i] != a) {
				return false;
			}
		}
		return true;
	}
/**
 * COLUMNS
 * @param matrix
 * @param column
 * @param b
 * @return
 */
	public static boolean Columns(char matrix[][], int column, char b) {
		for (int j = 0; j < matrix.length; j++) {
			if (matrix[j][column] != b) {
				return false;
			}
		}
		return true;
	}
/**
 * DIAGONALS
 * @param matrix
 * @param row
 * @param column
 * @param c
 * @return
 */
	public static boolean Diagonals(char matrix[][], int row, int column, char c) {
		if (row != column) {
			return false;
		} else {
			for (int i = 0; i < matrix.length; i++) {
				if (matrix[i][i] != c) {
					return false;
				}
			}
		}
		return true;
	}
/**
 * DIAGONALS
 * @param matrix
 * @param row
 * @param column
 * @param c
 * @return
 */
	public static boolean Diagonals1(char matrix[][], int row, int column,
			char c) {
		int temp = matrix.length - 1;
		if (row + column != temp) {
			return false;
		} else {
			for (int i = 0, j = matrix.length - 1; i < matrix.length; i++, j--) {
				if (matrix[i][j] != c) {
					return false;
				}
			}
		}
		return true;
	}
/**
 * INITIALIZATION OF MATRIX
 * @param matr
 */
	public static void Matrix(char[][] matr) {
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				matr[i][j] = ' ';
			}
		}
	}
/**
 * INPUT PLAYER X
 * @param matrix
 * @return 
 */
	public static boolean X(char matrix[][]) {
		Scanner input = new Scanner(System.in);
		char c = 'X';
		while (true) {
			System.out.println("Player X is on the move");
			System.out.println("Please enter coordinate X");
			int x = input.nextInt();
			System.out.println("Please enter coordinate Y");
			int y = input.nextInt();
			if (matrix[x][y] == ' ') {
				matrix[x][y] = c;
				if (Rows(matrix, x, c) == true) {
					return true;
				} else if (Columns(matrix, y, c) == true) {
					return true;
				} else if (Diagonals(matrix, x, y, c) == true) {
					return true;
				} else if (Diagonals1(matrix, x, y, c) == true) {
					return true;
				}
				return false;
			}
		}

	}
/**
 * INPUT PLAYER O
 * @param matrix
 * @return
 */
	public static boolean O(char matrix[][]) {
		Scanner input = new Scanner(System.in);
		char c = 'O';
		while (true) {
			System.out.println("Player O is on the move");
			System.out.println("Please enter coordinate X");
			int x = input.nextInt();
			System.out.println("Please enter coordinate Y");
			
				
			
			int y = input.nextInt();
			if (matrix[x][y] == ' ') {
				matrix[x][y] = c;
				if (Rows(matrix, x, c) == true) {
					return true;
				} else if (Columns(matrix, y, c) == true) {
					return true;
				} else if (Diagonals(matrix, x, y, c) == true) {
					return true;
				} else if (Diagonals1(matrix, x, y, c) == true) {
					return true;
				}
				return false;
				
			}
		}
	}
/**
 * OUTPUT OF THE MATRIX
 * @param matrix
 */
	public static void output(char[][] matrix) {
		for (int temp = 0; temp < matrix.length; temp++) {
			System.out.print(" -- ");
		}
		System.out.println();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("| " + matrix[i][j] + " ");
			}
			System.out.print("|");
			System.out.println();
			for (int temp = 0; temp < matrix.length; temp++) {
				System.out.print(" -- ");
			}
			System.out.println();
		}
	}

}
