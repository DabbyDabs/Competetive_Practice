package numberTheory;

import java.util.Scanner;

//a[i] = ( a[i - 1]*c + a[i - 2] ) modulo 10
public class DivisibleBy41 {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
	System.out.println("lets start the game::");
int testcases=s.nextInt();
	while(testcases>0) {
String a=s.next();
String a1=s.next();
int c=s.nextInt();
int n=s.nextInt();
//String useme="0123456789";
String dividend=a+a1;
for(int i=2;i<n;i++) {
 int prev1=dividend.charAt(dividend.length()-1)-48;
 int prev2=dividend.charAt(dividend.length()-2)-48;
 int next=(prev1*c+prev2)%10;
  dividend=dividend+next;
	}
int i = 0;
int remember = 0;
char temp = 't';
int m = 0;
 while (i <= dividend.length() - 1) {
	temp = dividend.charAt(i);
	m = temp - 48;
	if (i == 0) {
		remember = m % 41;
		i++;
		continue;
	}
	remember = ((remember * 10) % 41 + m % 41) % 41;

	i++;
}
if(remember==0) {
	System.out.println("YES");
}
else {
	System.out.println("NO");
}
testcases--;
}
	}
}
