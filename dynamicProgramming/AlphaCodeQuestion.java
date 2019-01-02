package dynamicProgramming;

import java.util.Scanner;

public class AlphaCodeQuestion {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Lets start!");
		String num=s.next();
		while(num.charAt(0)-48!=0) {
			int []number =returnsArrFromStrings(num);
			if(number.length==0) {
				System.out.println(0);
				num=s.next();
				continue;
			}
		CalculatesTotalNumberOfCodes(number);
			num=s.next();
		}
	}
public static void CalculatesTotalNumberOfCodes(int[] number) {
int []ways= new int[number.length];
ways[0]=1;
ways[1]=1;
if(number[0]*10+number[1]<=26) {
	ways[1]=2;
}
for(int i=2;i<number.length;i++) {
	if(number[i-1]*10+number[i]<=26) {
		ways[i]=((2*ways[i-2])%1000000007+(ways[i-1]-ways[i-2])%1000000007)%1000000007;
		continue;
		}
	ways[i]=ways[i-1];
	}
System.out.println(ways[ways.length-1]);
}
public static int[] returnsArrFromStrings(String s) {
	int []empty= {};
	int[]transformation= new int[s.length()];
	for(int i=0;i<s.length();i++) {
		int currNum=(int)s.charAt(i)-48;
		if(currNum==0) {
			return empty; 
		}
		transformation[i]=currNum;
	}
	return transformation;
	
}
}
