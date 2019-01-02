package dynamicProgramming;

public class LongestDecreasingSubsequence {

	public static void main(String[] args) {
int testarr[]= {23,22,12,20,19,18};
System.out.println(CalculatesLongestDecreasingSubsequence(testarr));
	}
	public static int CalculatesLongestDecreasingSubsequence(int[] arr) {
		int[] record = new int[arr.length];
		record[0] = 1;
		int totalMax=1;
		int max=Integer.MIN_VALUE;
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j <i; j++) {
         if(record[j]>max && arr[j]>arr[i]) {
        	 max=record[j];
        	 continue;
         }
         	}
if(max==Integer.MIN_VALUE) {
			record[i]=1;	
				continue;
			}
			record[i]=max+1;
			if(record[i]>totalMax) {
				totalMax=record[i];
			}
			max = Integer.MIN_VALUE;
		}
		return totalMax;
	}
}
