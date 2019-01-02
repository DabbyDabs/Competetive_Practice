package backtracking;
import java.util.Arrays;
import java.util.Scanner;

public class AgressiveCowsProblem {

	public static void main(String[] args) {
Scanner s= new Scanner(System.in);
	int num=0;
System.out.println("Enter the number of test cases::");
num=s.nextInt();
while(num!=0) {
	int stalls;
	int cows;
	//System.out.println("Enter the number of stalls::");
	stalls=s.nextInt();
	//System.out.println("Enter the number of cows::");
	cows=s.nextInt();
	int []choices=new int[stalls];
	//System.out.println("Now enter the stall numbers consequtively::");
	for(int i=0;i<stalls;i++) {
		choices[i]=s.nextInt();
	}
	Arrays.sort(choices);
	int []combinations=new int[cows];
	combinations[0]=choices[0];
	int min=Integer.MIN_VALUE;
	int ans=ReturnMinDistance(choices,combinations,1,1,min);
	//System.out.println("The minimum distance possible is "+ans);
	System.out.println(ans);
	num--;
	
}

}
public static int ReturnMinDistance(int[] arr,int []combinations,int count,int arrpointer,int min) {
	
	if(count==combinations.length) {
		
		int mindis=Integer.MAX_VALUE;
		int temp=Integer.MAX_VALUE;
		for(int i=1;i<combinations.length;i++) {
			System.out.print(combinations[i]+" ");
			temp=combinations[i]-combinations[i-1];
			if(mindis>temp)
				mindis=temp;
		}
		System.out.println();
		return Math.max(min,mindis);
	}
	if(arrpointer==arr.length) {
		return Integer.MIN_VALUE;
	}
	
	int x=ReturnMinDistance(arr,combinations,count,arrpointer+1,min);
	combinations[count]=arr[arrpointer];
	int y=ReturnMinDistance(arr,combinations,count+1,arrpointer+1,min);
	
	return Math.max(x,y);
	
}
}
