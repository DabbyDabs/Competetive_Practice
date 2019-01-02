package backtracking;
import java.util.Scanner;
import java.util.Arrays;
public class DistributeCandies {

	public static void main(String[] args) {
int testcases=0;
int students=0;
int boxes=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of test cases::");
testcases=s.nextInt();
while(testcases!=0) {
	System.out.println("Enter the number of boxes::");
	boxes=s.nextInt();
	System.out.println("Enter the number of students::");
	students=s.nextInt();
	int []arr= new int[boxes];
	System.out.println("Enter the number of candies in each box consequtively::");
	for(int i=0;i<arr.length;i++) {
		arr[i]=s.nextInt();
	}
	Arrays.sort(arr);
	int ans=arr[arr.length-students];
	System.out.println(ans);
testcases--;	
}
	}

}
