package numberTheory2;

public class FibonacciUsingMatrices {

	public static void main(String[] args) {
		int N = 8;
		int[][] matrix= {{ 1, 1}, { 1, 0 }};
		//int[][] matrix2 = { { 1, 1, 1 }, { 1, 1, 2 }, { 3, 2, 1 } };
	findsFibonacciByMatrixExponentiation(matrix,N);
		// multipliesGivenTwoSquareMatrices(matrix1, matrix2);
		
	}

	public static void findsFibonacciByMatrixExponentiation(int[][] matrix, int N) {
int [][] finalAns=givesPowerofTheMatrix(matrix, N-1);
System.out.println(finalAns[0][0]);
	}

	public static int[][] givesPowerofTheMatrix(int[][] matrix, int power) {
		if(power==1) {
			return matrix;
		}
		if(power==0) {
			int [][]identityMatrix=new int[matrix.length][matrix.length];
			for (int m = 0; m < matrix.length; m++) {
				for (int r = 0; r < matrix.length; r++) {
					if(m==r) {
						identityMatrix[m][r]=1;
					}
				}
			}
			return identityMatrix;
		}
		
		if (power % 2 == 0) {
 int [][]smallAns= givesPowerofTheMatrix(matrix, power/2);
  return multipliesGivenTwoSquareMatrices(smallAns,smallAns);
		}
		else {
			int [][]smallAns= givesPowerofTheMatrix(matrix, power/2);
			return multipliesGivenTwoSquareMatrices(matrix,multipliesGivenTwoSquareMatrices(smallAns,smallAns));
		}

	}

	public static int[][] multipliesGivenTwoSquareMatrices(int[][] matrix1, int[][] matrix2) {

		int n = matrix1.length;
		int[][] ans = new int[n][n];
		int i = 0;// i and j are the rows and columns for matrix1
		int j = 0;
		int k = 0;// k and l are the rows and columns for matrix2
		int l = 0;
		int sum = 0;
		for (l = 0; l < n; l++) {
			for (i = 0; i < n; i++) {
				while (j < n && k < n) {
					sum = sum + (matrix1[i][j]) * (matrix2[k][l]);
					j++;
					k++;
				}
				j = 0;
				k = 0;
				ans[i][l] = sum;
				sum = 0;

			}
		}
		return ans;
	}

	public static void Print2DArray(int[][] ans) {
		int n = ans.length;
		for (int m = 0; m < n; m++) {
			for (int r = 0; r < n; r++) {
				System.out.print(ans[m][r] + " ");
			}
			System.out.println();
		}
	}
}
