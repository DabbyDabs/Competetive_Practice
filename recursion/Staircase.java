package recursion;

public class Staircase {

	public static void main(String[] args) {
int n= 4;
System.out.println(StaircaseProblem(n));
	}
public static int StaircaseProblem(int n) {
	if(n<0) {
		return 0;
	}
	if(n==0) {
		return 1;
	}
	
	int x=StaircaseProblem(n-1);
	int y=StaircaseProblem(n-2);
	int z=StaircaseProblem(n-3);
	return x+y+z;
}
}
