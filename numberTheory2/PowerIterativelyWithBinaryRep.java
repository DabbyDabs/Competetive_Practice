package numberTheory2;

public class PowerIterativelyWithBinaryRep {

	public static void main(String[] args) {
		int a = 7;
		int b = 2;
		System.out.println(findsPowerIteratively(a, b));
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
