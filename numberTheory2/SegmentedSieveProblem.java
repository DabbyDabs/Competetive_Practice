package numberTheory2;
// in the boolean array finally generated(segmented sieve) false indicates prime no.
//this code has not been debugged and doesn't work properly
public class SegmentedSieveProblem {

	public static void main(String[] args) {
	int L=9;
	int R=49;
	givesBackSegmentedSieve(L, R);
	}
public static boolean [] givesBackSegmentedSieve(int L,int R) {
	boolean []segmentedSieve= new boolean[R-L+1];
int rootR=(int)Math.pow(R,0.5);
	int[] smallerPrimes=returnSeive(rootR);
int indexVar=0;
for(int i=0;i<smallerPrimes.length;i++) {
	int remainder = (L) % smallerPrimes[i];
	
	int start=L-remainder+smallerPrimes[i];
	int actualStart=start-L+1;
	if(remainder==0) {
		actualStart=0;
	}
	//System.out.println(actualStart);
	indexVar=actualStart;
	for(int j=1;j<=segmentedSieve.length-1;j++) {

		if(j==indexVar) {
			System.out.println(indexVar);
	segmentedSieve[j-1]=true;
	indexVar=indexVar+smallerPrimes[i];
	
}
  	
		
	}
	System.out.println();
}
for(int i=0;i<segmentedSieve.length;i++) {
System.out.println(i+L+" "+segmentedSieve[i]);
}
	
	return segmentedSieve;
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
