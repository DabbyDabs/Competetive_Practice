package numberTheory;

public class CountPrimesUptoN {

	public static void main(String[] args) {
int N=100;
int count=0;
int []arr= new int[N+1];
for(int i=2;i<=N;i++) {
	if(arr[i]==0)
	{if(CheckPrimeBetter(i)==true)
	count++;
	for(int j=i*i;j<=N;j=j+i)//we need to fill the array only for i<=square root of N
		if(j%i==0)                         
			arr[j]=100;
	
	}
}
System.out.println("The number of prime numbers are::"+count);
for(int i=1;i<arr.length;i++) {
	if(arr[i]!=100)
		System.out.println(i);
}
	}
	public static boolean CheckIfPrime(int n) {
		if(n==1)
			return false;
			for(int i=2;i<=n/2;i++) {
				if(n%i!=0)
					continue;
				return false;
			}
			return true;
		}
	public static boolean CheckPrimeBetter(int n) {
		if(n==1)
			return false;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i!=0)
				continue;
			return false;
		}
		return true;
	}
}
