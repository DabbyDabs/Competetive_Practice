package numberTheory;
import java.util.ArrayList;
public class StrangeOrder {

	public static void main(String[] args) {
int n=10;
PrintStrangeOrder(n);
	}
public static void PrintStrangeOrder(int n){
int []arr=new int[n];
for(int i=0;i<arr.length;i++) {
	arr[i]=i+1;
}
	
int check=n-1;
while(check>=0)
{
	if(arr[check]==-1) {
		check--;
		continue;
	}
int[] primes = returnSeive(check);
	
	ArrayList<Integer>a=new ArrayList();
	a.add(arr[check]);
	for(int i=0;i<primes.length;i++) {
		int currPrime=primes[i];
		if(arr[check]%currPrime==0) {
		int k=check-currPrime;
		while(k>0) {
			if(arr[k]!=-1)
			{a.add(arr[k]);
			arr[k]=-1;
			
			}
			k=k-currPrime;
		}
			
		}
		
		
	}
	a.sort(null);
	for(int i=0;i<a.size();i++) {
		System.out.print(a.get(a.size()-1-i)+" ");
	}
	check--;
}
	
	
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
