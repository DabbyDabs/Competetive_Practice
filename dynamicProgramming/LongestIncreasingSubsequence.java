package dynamicProgramming;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int arr[] = {4,3,9,7,6,8,20};
		System.out.println(CalculatesLongestIncreasingSubsequence(arr));

	}

 public static int CalculatesLongestIncreasingSubsequence(int[] arr) {
		int[] record = new int[arr.length];
		record[0] = 1;
		int totalMax=1;
		int max=Integer.MIN_VALUE;
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j <i; j++) {
         if(record[j]>max && arr[j]<arr[i]) {
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
