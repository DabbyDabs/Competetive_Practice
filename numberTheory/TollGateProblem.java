package numberTheory;

public class TollGateProblem {

	public static void main(String[] args) {
int tollnumber=7;
	int [] men= {79,27,27,96,96,38,83,43,99,7,92,98};
int [] toll= {20,42,44,25,36,43,2,41,35,2,30,26};
int ans=CalculatesMinimumCost(men, toll,0,0,0,0,0);
System.out.println(ans);
	}
public static int CalculatesMinimumCost(int []men,int[] toll,int count,int men1, int men2, int men3,int cost) {
	if(count==toll.length) {
		return cost;
	}
	
	int x=CalculatesMinimumCost(men, toll, count+1, men1, men2, men3,cost+toll[count]);
	int y=CalculatesMinimumCost(men, toll, count+1, men1+men[count], men2, men3, cost+(2*toll[count]));
	int min=Math.min(x,y);
	if(men[count]< men1+men2+men3) {
	
		if(men[count]<men3) {
			int z=CalculatesMinimumCost(men,toll, count+1,0, men1, men2, cost);
			return Math.min(z,min);
		}
		if(men[count]<(men3+men2)) {
		int z=CalculatesMinimumCost(men, toll, count+1 ,0, men1,(men2+men3)-men[count], cost);
		return Math.min(z,min);
		}
		if(men[count]<(men1+men2+men3)) {
			int z=CalculatesMinimumCost(men, toll, count+1,0,(men1+men2+men3)-men[count],0, cost);
			return Math.min(z,min);
		}
		
	}
return min;
	
	
}
}
