package numberTheory;

import java.util.Scanner;

public class CubeFreeNumber {

	public static void main(String[] args) {
Scanner s= new Scanner(System.in);
System.out.println("Let's begin!!!");
		int testcases=1;
int mark=1;
while(testcases!=0) {
	int n=s.nextInt();
	System.out.print("Case"+mark+": ");
	givesCubeFreeNumbers(n);
	mark++;
	testcases--;
}
	}
public static void givesCubeFreeNumbers(int n) {
int []seive= new int[n+1];
	int count=0;
	int k=3;
	int cube=8;
	int sum=8;
	while(sum<=n) {
		seive[sum]=1;
		System.out.println(sum);
		sum=sum+8;
		count++;
	}
	int flag=0;
	while(cube<=n) {
		
		if(cube==n) {
			flag=1;
			break;
		}
		cube=k*k*k;
   sum=cube;
   while(sum<=n&& cube<=n) {
	   seive[sum]=seive[sum]+1;
		System.out.println(sum);
     
	   if(seive[sum]==1&& sum<=n) {
		   count++;
	   }
	   sum=sum+cube;
   }
     k++;
		}
	if(flag==1) {
		System.out.println("Not Cube Free");
		return;
	}
if(seive[n]==1)
	System.out.println("Not Cube Free");
if(seive[n]==0)
	{System.out.println(n-count);
	}
}
}
