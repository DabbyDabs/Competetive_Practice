package tests;

public class PrintIncreasingDigitsRecursively {

	public static void main(String[] args) {
int n=3;
PrintIncreasingDigits(n+1,"0");
	}
public static void PrintIncreasingDigits(int n,String s) {
	if(n==1) {
		System.out.print(s.substring(1)+" ");
		
	}
	
	
	int number=s.charAt(s.length()-1);
	for(int i=number+1;i<=57;i++) {
		char c=(char)i;
		PrintIncreasingDigits(n-1,s+c);
	}
	
	
}
}
