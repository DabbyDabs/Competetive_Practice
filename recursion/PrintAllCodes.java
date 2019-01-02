package recursion;

public class PrintAllCodes {

	public static void main(String[] args) {

		printCodes(1126, "");
	}

	public static void printCodes(int d, String output) {
		if (d == 0) {
			System.out.println(output);
			return;
		}
		int temp = d;
		int count = 0;
		while (temp != 0) {
			temp = temp / 10;
			count++;
		}
		int n = (pow(10, count - 1));
		int m = (d / n);
		if (n == 1) {
			d = 0;
		}
		printCodes(d % n, output + returnCharacter(m));
		int x = (d * 10) / (n);
		if (x <= 26) {
			if (n != 1) {
				printCodes((d * 10) % n, output + returnCharacter(x));
			}

		}

	}

	public static int pow(int x, int y) {
		int m = 1;
		for (int i = 0; i < y; i++) {
			m = m * x;
		}
		return m;
	}

	public static char returnCharacter(int n) {
		int m = n + 96;
		char c = (char) m;
		return c;
	}
}
