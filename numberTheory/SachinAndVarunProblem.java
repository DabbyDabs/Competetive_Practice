package numberTheory;
import java.util.Scanner;
public class SachinAndVarunProblem {

	public static void main(String[] args) {

Scanner s= new Scanner(System.in);
System.out.println("Please enter the number of testcases::");
int testcases=s.nextInt();
while(testcases!=0) {
System.out.println("Enter the value of a::");
int a=s.nextInt();
System.out.println("Enter the value of b::");
int b=s.nextInt();
System.out.println("Enter the value of d::");
int d=s.nextInt();
double x=0;
double y=0;
int estimate=(d/a);
int count=0;
for(;y<=estimate;y++) {
	x=(d-(b*y))/a;
	if(x>=0&&(x%1)==0.0) {
		count++;
	}
	
}
System.out.println("Your output is::");
	System.out.println(count);
	testcases--;
}
	}
	}


