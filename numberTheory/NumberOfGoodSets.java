package numberTheory;
//This solution did not shape well as accepted,it had loopholes,was a great effort though!
public class NumberOfGoodSets {

	public static void main(String[] args) {
int arr[]= {2,6,7,9,16,18,19,20};
int[] []table=new int [arr.length][arr.length];
for(int i=0;i<table.length;i++) {
	table[i][0]=arr[i];
	int k=1;
	for(int j=i+1;j<arr.length;j++) {
		if(arr[j]%arr[i]==0)
		{	table[i][k]=j;
		k++;  }
	}
	
}
//print2Darray(table);
int FinalAns=GivesNumberOfSets(table,0,0,0);
System.out.println(FinalAns);

	}
	public static int GivesNumberOfSets(int[][]table,int index, int count,int x) {
	if(table[index][1]==0) {
		return (int)(Math.pow(2,count+1)-1);
	}
	if(count==0) {
		for(int i=0;i<table.length && table[index][0]!=100;i++) {
			for(int j=1;table[index][j]>0;j++) {
				table[index][0]=100;
				 x=x+GivesNumberOfSets(table,table[index][j],count+1,x);
		}
	}
	}
		if(count>0) {
		for(int j=1;table[index][j]>0 && table[index][0]!=100;j++) {
			table[index][0]=100;
	  x=x+GivesNumberOfSets(table,table[index][j],count+1,x);
	}
		}
	return x;
	}
	
public static void print2Darray(int[][]table) {
	for(int i=0;i<table.length;i++) {
		for(int j=0;j<table.length;j++)
			System.out.print(table[i][j]+" ");
		System.out.println();
	}
}
}
