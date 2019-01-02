package recursion;

public class FindFibonacci {

	public static void main(String[] args) {
	int n=5;
		System.out.println(returnFibonacci(n-1));

	}
public static int returnFibonacci(int x) {
	if(x==1||x==0) {
		return 1;
	}
	return returnFibonacci(x-1)+returnFibonacci(x-2);
}
}
//1 1 2 3 5 8 13