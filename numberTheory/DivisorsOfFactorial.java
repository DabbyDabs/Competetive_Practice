package numberTheory;

public class DivisorsOfFactorial {

	public static void main(String[] args) {
		System.out.println(givesDivisorsOfFactorial(4));
	}

	public static int[] returnSeive(int N) {
		int count = 0;
		int[] arr = new int[N + 1];
		for (int i = 2; i <= N; i++) {
			if (arr[i] == 0) {
				if (CheckPrimeBetter(i) == true)
					count++;
				for (int j = i * i; j <= N; j = j + i)
					if (j % i == 0)
						arr[j] = 100;

			}
		}
		int k = 0;
		int[] ans = new int[count];
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] != 100) {
				ans[k] = i;
				k++;
			}
		}

		return ans;
	}

	public static int givesDivisorsOfFactorial(int n) {
		int totalAns = 1;
		long count = 0;
		int special = 1000000007;
		int[] arr = returnSeive(n);
		for (int i = 0; i < arr.length; i++) {
			int x = arr[i];
			int y = 1;
			count = 0;
			while (n >= Math.pow(x, y)) {
				count = (count % special + (int) (n / Math.pow(x, y)) % special) % special;
				// System.out.println(count);
				y++;
			}
			totalAns = (int) (((count + 1) % special) * (totalAns) % special);
			// System.out.println(totalAns);
		}
		totalAns = (totalAns + special) % special;
		return totalAns;
	}

	public static long returnFactorial(int n) {

		long factorial = 1;
		for (int i = 2; i <= n; i++) {
			factorial = (factorial) * (i);
		}
		return factorial;
	}

	public static boolean CheckPrimeBetter(int n) {
		if (n == 1)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i != 0)
				continue;
			return false;
		}
		return true;
	}
}
