package numberTheory2;
//formula used is:: S(n)=F(n+2)-1;
public class SumOfRangeOfFibbNum {

	public static void main(String[] args) {
System.out.println(CalculatesSumOfRangeOfFibbNum(10, 19));
	}
public static long CalculatesSumOfRangeOfFibbNum(long N,long M) {
	int special=1000000007;
	long[][] matrix= {{ 1, 1}, { 1, 0 }};
	long fibb1=findsFibonacciByMatrixExponentiation(matrix, N+1);
	long fibb2=findsFibonacciByMatrixExponentiation(matrix, M+2);
	long sum1=fibb1-1;
	long sum2=fibb2-1;
	long ans=(sum2-sum1)%special;
	return ans;
}
public static long findsFibonacciByMatrixExponentiation(long[][] matrix, long N) {
long [][] finalAns=givesPowerofTheMatrix(matrix, N-1);
return finalAns[0][0];
	}

	public static long[][] givesPowerofTheMatrix(long[][] matrix, long power) {
		if(power==1) {
			return matrix;
		}
		if(power==0) {
			long [][]identityMatrix=new long[matrix.length][matrix.length];
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
 long [][]smallAns= givesPowerofTheMatrix(matrix, power/2);
  return multipliesGivenTwoSquareMatrices(smallAns,smallAns);
		}
		else {
			long [][]smallAns= givesPowerofTheMatrix(matrix, power/2);
			return multipliesGivenTwoSquareMatrices(matrix,multipliesGivenTwoSquareMatrices(smallAns,smallAns));
		}

	}

	public static long[][] multipliesGivenTwoSquareMatrices(long[][] matrix1, long[][] matrix2) {

		int n = matrix1.length;
		long [][] ans = new long[n][n];
		int i = 0;// i and j are the rows and columns for matrix1
		int j = 0;
		int k = 0;// k and l are the rows and columns for matrix2
		int l = 0;
		long sum = 0;
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
}
