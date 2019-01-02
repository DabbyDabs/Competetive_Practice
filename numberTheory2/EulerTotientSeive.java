package numberTheory2;

public class EulerTotientSeive {

	public static void main(String[] args) {
int n=12;
int []ans= makesEulersTotientSieve(n);
for(int i=0;i<ans.length;i++) {
	System.out.print(ans[i]+" ");
}
}
public static int[] makesEulersTotientSieve(int n) {
	int []EulerTotientSieve = new int[n+1];
	EulerTotientSieve[1]=1;
	int itr=0;
	for(int i=2;i<EulerTotientSieve.length;i++) {
		EulerTotientSieve[i]=i;
	}
	for(int i=2;i<=n;i++) {
		if(EulerTotientSieve[i]==i) {
			EulerTotientSieve[i]=i-1;
			itr=2*(i);
			while(itr<=n) {
				EulerTotientSieve[itr]=(EulerTotientSieve[itr]*(i-1));
				EulerTotientSieve[itr]=(EulerTotientSieve[itr]/i);
				itr=itr+i;
				}
		}
		
		
	}
	return EulerTotientSieve;
}
}
