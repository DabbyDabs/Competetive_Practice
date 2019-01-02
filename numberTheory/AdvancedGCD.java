package numberTheory;

import java.util.Scanner;

public class AdvancedGCD {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of testcases::");
		int testcases = scan.nextInt();
		while (testcases > 0) {
			System.out.println("Enter the small number::");
			int a = scan.nextInt();
			System.out.println("Enter the larger number in form of String::");
			String s = scan.next();
			int i = 0;
			int remember = 0;
			char temp = 't';
			int m = 0;
			if (a == 0) {
				System.out.print(0);
				continue;
			}
			while (i <= s.length() - 1) {
				temp = s.charAt(i);
				m = temp - 48;
				if (i == 0) {
					remember = m % a;
					i++;
					continue;
				}
				remember = ((remember * 10) % a + m % a) % a;

				i++;
			}
			int ans = givesGCDiteratively(a, remember);
			System.out.println(ans);
			testcases--;

		}
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
}
