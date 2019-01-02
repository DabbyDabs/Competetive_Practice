package numberTheory;

public class CheckWhetherPrime {

	public static void main(String[] args) {
System.out.println(CheckIfPrime(1));
	}
public static boolean CheckIfPrime(int n) {
if(n==1)
	return false;
	for(int i=2;i<n/2;i++) {
		if(n%i!=0)
			continue;
		return false;
	}
	return true;
}

}
