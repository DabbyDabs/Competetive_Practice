package numberTheory;

public class NoOfBalancedBinaryTrees {

	public static void main(String[] args) {
int n=6;

		System.out.println(returnNoOfBinaryTrees(n));
	}
static int returnNoOfBinaryTrees(int n) {
	if(n==1||n==0)
		return 1;
	long x=returnNoOfBinaryTrees(n-1);
	long y=returnNoOfBinaryTrees(n-2);
	int special=(int)(Math.pow(10,9)+7);
	long ans1=(long)(x*x);
	long ans2=(long)(2*x*y);
	int temp1=(int)(ans1%special);
	int temp2=(int)(ans2%special);
	int m=(temp1+temp2+special)%special;
	return m;
	
	
	
}
}
