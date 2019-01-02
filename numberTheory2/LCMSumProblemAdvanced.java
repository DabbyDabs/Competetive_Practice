package numberTheory2;

import java.util.Scanner;

public class LCMSumProblemAdvanced {

	public static void main(String[] args) {
//		System.out.println("Lets start!!!");
//		Scanner s = new Scanner(System.in);
		int sum = 0;
		int N =12;
		int[] primeFactors = returnSeive(N);
		int[] powers = new int[primeFactors.length];
		
		
		int count = 0;
		int q = N; 
		for (int k = 0; k < primeFactors.length; k++) {
			while (q % primeFactors[k] == 0) {
				count++;
				q = q / primeFactors[k];
			}
			powers[k] = count;
			count = 0;
			q = N;
			}
		int[] totient = makesEulersTotientSieve(N);
		for(int i=0;i<powers.length;i++) {
			System.out.println(primeFactors[i]+" "+powers[i]);
		}
		int ans = givesLCMSumRecursively(powers, primeFactors, 0, totient, 1, 0, 0) + 1;
		int Answer = (N / 2) * ans;
		System.out.println(Answer);

		}

	public static int givesLCMSumRecursively(int[] powers, int[] primeFactors, int index, int[] totient, int divisor,
			int ans, int finalAns) {
		if (index == powers.length) {
			return ans;
		}

		for (int i = 0; i <= powers[index]; i++) {
			divisor = divisor * ((int) Math.pow(primeFactors[index], i));
			System.out.println(divisor);
			ans = ans + divisor * (totient[divisor]);
			finalAns = finalAns
					+ givesLCMSumRecursively(powers, primeFactors, index + 1, totient, divisor, ans, finalAns);
		}
		return finalAns;

	}

	public static int[] makesEulersTotientSieve(int n) {
		int[] EulerTotientSieve = new int[n + 1];
		EulerTotientSieve[1] = 1;
		int itr = 0;
		for (int i = 2; i < EulerTotientSieve.length; i++) {
			EulerTotientSieve[i] = i;
		}
		for (int i = 2; i <= n; i++) {
			if (EulerTotientSieve[i] == i) {
				EulerTotientSieve[i] = i - 1;
				itr = 2 * (i);
				while (itr <= n) {
					EulerTotientSieve[itr] = (EulerTotientSieve[itr] * (i - 1));
					EulerTotientSieve[itr] = (EulerTotientSieve[itr] / i);
					itr = itr + i;
				}
			}

		}
		return EulerTotientSieve;
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
