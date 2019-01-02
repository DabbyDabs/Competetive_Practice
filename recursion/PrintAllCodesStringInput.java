package recursion;

public class PrintAllCodesStringInput {

	public static void main(String[] args) {
		String s = "12345";
		printAllCodes(s, "");
	}

	public static void printAllCodes(String s, String output) {
		if (s.length() == 0) {
			System.out.println(output);
		}
		if (s.length() >= 2) {
			printAllCodes(s.substring(1), output + returnCharacter(s.substring(0, 1)));
			if (CheckValue(s.substring(0, 2)) <= 26) {
				printAllCodes(s.substring(2), output + returnCharacter(s.substring(0, 2)));
			}

		}
		if (s.length() == 1)
			printAllCodes("", output + returnCharacter(s.substring(0, 1)));

	}

	public static int CheckValue(String input) {
		int num = 0;
		int len = input.length() - 1;
		for (int i = 0; i < input.length(); i++) {
			num = num + ((input.charAt(i) - 48) * pow(10, len));
			len--;
		}
		return num;
	}

	public static int pow(int x, int y) {
		int m = 1;
		for (int i = 0; i < y; i++) {
			m = m * x;
		}
		return m;
	}

	public static char returnCharacter(String str) {

		if (str.length() == 1) {
			char m = (char) ((int) str.charAt(0) + 48);
			return m;
		}
		int x = (10) * (str.charAt(0) - 48);
		int y = str.charAt(1) - 48;
		int z = x + y;
		char m = (char) (z + 96);
		return m;
	}
}
