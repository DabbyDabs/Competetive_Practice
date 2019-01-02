package backtracking;

public class N_QueenProblem {

	public static void main(String[] args) {
		int n = 6;
		int[][] darr = new int[n][n];
		PrintSafeQueens(darr, n, 0);

	}

	public static void PrintSafeQueens(int[][] darr, int n, int row) {

		if (row == n) {
			for (int i = 0; i < darr.length; i++) {
				for (int j = 0; j < darr[0].length; j++) {
					if (darr[i][j] == 9)
						darr[i][j] = 0;
				}
			}

			Print2DArray(darr);
			System.out.println();
			System.out.println();
			return;
		}
		int column = 0;
		while (column != n) {

			if (darr[row][column] != 9) {
				int[][] duplicate = new int[n][n];
				for (int i = 0; i < darr.length; i++) {
					for (int j = 0; j < darr[0].length; j++) {
						duplicate[i][j] = darr[i][j];
					}
				}

				for (int i = row + 1; i < duplicate.length; i++) {
					for (int j = 0; j < duplicate[0].length; j++) {
						if (j == column) {
							duplicate[i][j] = 9;
						}
						if (i + j == row + column) {
							duplicate[i][j] = 9;
						}
						if (i - j == row - column) {
							duplicate[i][j] = 9;
						}
					}
				}

				duplicate[row][column] = 1;
				PrintSafeQueens(duplicate, n, row + 1);
			}
			column++;
		}

	}

	public static void Print2DArray(int[][] darr) {
		for (int i = 0; i < darr.length; i++) {
			for (int j = 0; j < darr[0].length; j++) {
				System.out.print(darr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
