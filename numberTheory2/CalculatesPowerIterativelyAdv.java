package numberTheory2;

public class CalculatesPowerIterativelyAdv {

	public static void main(String[] args) {
		int a = 11;
		int b = 33;
		int c = 1000000007;
		int ans1 = FindsPowerIteratively(a, b, c);
		int ans2 = CalculatesPower(a, b, c);
		ans2 = (ans2 + c) % c;
		int ans3 = findsPowerIteratively(a, b);
		System.out.println(ans1 + " " + ans2 + " " + ans3);
	}

	public static int FindsPowerIteratively(int a, int b, int c) {
		int power = b;
		int product = 1;

		int base = a;
		int remaining = 1;
		while (power != 1) {
			if (power % 2 == 0) {
				product = (((((base % c) * (base % c)) % c) % c)) % c;
				base = (base * base) % c;
				power = power / 2;
			}

			else {
				product = (((((base % c) * (base % c)) % c) % c)) % c;
				remaining = ((remaining % c) * (base % c)) % c;
				base = (((((base % c) * (base % c)) % c))) % c;
				power = power / 2;
			}

		}
		int ans = remaining * product;
		return (ans + c) % c;
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

	public static int findsPowerIteratively(int a, int b) {
		int special = 1000000007;
		int ans = 1;
		int currIndex = a;
		int count = 0;
		while (b != 0) {
			int remainder = b % 2;
			if (remainder == 0) {
				if (count == 0) {
					b = b / 2;
					count++;
					continue;
				}
				currIndex = ((currIndex % special) * (currIndex % special)) % special;
				b = b / 2;
				count++;
				continue;
			}
			if (remainder == 1) {
				if (count == 0) {
					ans = currIndex;
					b = b / 2;
					count++;
					continue;
				}
				currIndex = ((currIndex % special) * (currIndex % special)) % special;
				ans = ((ans % special) * (currIndex % special)) % special;
				b = b / 2;
				count++;
			}

		}

		return (ans + special) % special;

	}
}
