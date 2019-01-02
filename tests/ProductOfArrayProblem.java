package tests;

import java.util.Scanner;

public class ProductOfArrayProblem {

	public static void main(String[] args) {
Scanner s= new Scanner(System.in);
		int n=s.nextInt();
int[]arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		long product=1;
int sum=0;
for(int i=0;i<arr.length;i++) {
	sum=sum+arr[i];
	product=product*arr[i];
}
int mean=(int)sum/arr.length;
long product2=(long)Math.pow(mean,arr.length);
if(product2>=product) {
	while(product2>product) {
		mean=mean-1;
		product2=(long)Math.pow(mean,arr.length);
	}
	System.out.println(mean+1);
}
else{
	while(product2<product) {
		mean=mean+1;
		product2=(long)Math.pow(mean,arr.length);
	}
	System.out.println(mean);
}
	}

}
