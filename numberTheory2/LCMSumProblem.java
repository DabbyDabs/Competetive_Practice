package numberTheory2;

import java.util.Scanner;

public class LCMSumProblem {
	public static void main(String[] args) {
System.out.println("Enter the number::");
		Scanner s= new Scanner(System.in);
int sum=0;
int N=s.nextInt();
int n=0;
int m=0;
for(int i=1;i<=N;i++) {
	 n=i;
	 m=N;
	 int [] primeFactors= returnSeive(n);
	 int []powers= new int[primeFactors.length];
	 int count=0;
	 int q=n;
	 int cutshort=m;
	 for(int k=0;k<primeFactors.length;k++) {
	 while(q%primeFactors[k]==0) {
	 	count++;
	 	q=q/primeFactors[k];
	 }
	 powers[k]=count;
	 count=0;
	 q=n;
	 }

	 for(int j=0;j<primeFactors.length;j++) {
	 if(cutshort%primeFactors[j]==0) {
	   while(powers[j]!=0 && cutshort%primeFactors[j]== 0) {
	 	  cutshort=cutshort/primeFactors[j];
	 	  powers[j]--;
	   }
	 	}}
	 int LCM=n*cutshort;
	 sum=sum+LCM;
}

System.out.println(sum);

 	

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
