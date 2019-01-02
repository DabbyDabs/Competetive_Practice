package tests;
import java.util.Arrays;
import java.util.Scanner;
public class PillarQuestion {

	public static void main(String[] args) {
Scanner s= new Scanner(System.in);
		int n=s.nextInt();
int[]heights=new int[n];
for(int i=0;i<heights.length;i++) {
	heights[i]=s.nextInt();
}
Arrays.sort(heights);
int sum=0;
for(int i=0;i<heights.length-2;i++) {
	sum=sum+heights[i];
}
int ans=(heights.length-2)*(heights[n-2])-sum;
System.out.println(ans);
	}

}
