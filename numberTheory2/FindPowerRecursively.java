package numberTheory2;

public class FindPowerRecursively {

	public static void main(String[] args) {
		int special = 1000000007;
		System.out.println(CalculatesPower(2, 5, special));
	}

	public static int CalculatesPower(int a, int b, int c) {
		if (b == 0) {
			return 1;
		}

		if (b % 2 == 0) {
			return CalculatesPower((a * a) % c, b / 2, c);
		} else {

			return ((a % c) * (CalculatesPower((a * a) % c, b / 2, c))) % c;
		}

	}
}
