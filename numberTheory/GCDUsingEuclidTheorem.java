package numberTheory;

public class GCDUsingEuclidTheorem {

	public static void main(String[] args) {
		int a = 3;
		int b = 2;
		System.out.println(givesGCDiteratively(a, b));
	}

	public static int givesGCDiteratively(int a, int b) {
		while (b != 0) {
			if (b > a) {
				int temp1 = b;
				b = a;
				a = temp1;
			}

			int temp = a;
			a = b;
			b = temp % b;

		}
		return a;

	}

	public static int bringsGCDrecursively(int a, int b) {
		if (b == 0) {
			return a;
		}
		if (b > a) {
			int temp = b;
			b = a;
			a = temp;
		}
		return bringsGCDrecursively(b, a % b);

	}
}
