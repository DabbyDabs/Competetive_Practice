package numberTheory;

import java.util.Scanner;

public class NumberOfFactors {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Lets start:");
		int testcases=s.nextInt();
		while(testcases>0) {
		
			int a = s.nextInt();
		int b = s.nextInt();
		int n = s.nextInt();
	System.out.println(nFactorfulNumbersCount(a, b, n,s));
	}
	}

	public static int nFactorfulNumbersCount(int a, int b, int n,Scanner s) {
		int arr[] = new int[b - a + 1];
		int primes[] = returnSeive(b);
		int k = 0;
		int check = a;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for (int j = 0; j < primes.length; j++) {
				if(check==primes[j]) {
					count=1;
					break;
				}
				if (check % primes[j] == 0) {
					if (count > n) {
						break;
					}
					count++;
				}

			}
			arr[i] = count;
			check++;
		}
		int finalAns=0;
for(int i=0;i<arr.length;i++) {
	if(arr[i]==n) 
		finalAns++;
}
return finalAns;
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
