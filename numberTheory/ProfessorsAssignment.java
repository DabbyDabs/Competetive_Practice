package numberTheory;

public class ProfessorsAssignment {

	public static void main(String[] args) {
		System.out.println("goodmorning");
		givesSumOfAllDivisors(4, 12);
		int special = 1000000007;
		int N = 5;
		int i = 1;
		int j = i;
		int ans = 0;
		while (i <= N) {
			j = i;
			while (j <= N) {
				ans = (ans % special + givesSumOfAllDivisors(i, j) % special) % special;
				j++;
			}
			i++;
		}
		System.out.println(ans);
	}

	public static int givesSumOfAllDivisors(int a, int b) {
		if (b > a) {
			int temp = b;
			b = a;
			a = temp;
		}
		int[] seive = new int[b + 1];
		seive[1] = 1;
		seive[b] = 1;
		for (int i = 2; i <= b / 2; i++) {
			if (b % i == 0) {
				seive[i] = 1;
			}

		}
		int sum = 0;
		for (int i = 1; i < seive.length; i++) {
			if (seive[i] == 1) {
				if (a % i == 0) {
					sum = sum + i;
				}

			}
		}
		return sum;
	}
}
