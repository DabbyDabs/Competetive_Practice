package dynamicProgramming;

public class LargestBitonicSubarray {

	public static void main(String[] args) {
		int testarr1[] = { 10, 351, 997, 693, 506, 112, 930, 815, 53, 815, 89, 6 };
		int testarr[]= {15,20,20,6,4,2};
		int count=0;
		for(int i=0;i<testarr.length-1;i++) {
			if(testarr[i]==testarr[i+1]) {
				testarr[i]=Integer.MAX_VALUE;
				count++;
				}
		}
		
		int []updatedArr= new int[testarr.length-count];
		int k=0;
		for(int i=0;i<testarr.length;i++) {
			if(testarr[i]!=Integer.MAX_VALUE) {
				updatedArr[k]=testarr[i];
				k++;
				}
			
		}
		
		
	System.out.println(longestBitonicSubarray(updatedArr));
	}

	public static int longestBitonicSubarray(int[] arr) {
		int max = Integer.MIN_VALUE;
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			temp = CalculatesIncreasingLongestSubsequence(arr, i) + CalculatesLongestDecreasingSubsequence(arr, i);
//			System.out.println(CalculatesIncreasingLongestSubsequence(arr, i) + " "
//					+ CalculatesLongestDecreasingSubsequence(arr, i));
			// System.out.println(CalculatesLongestDecreasingSubsequence(arr,i));
			if (temp > max) {
				max = temp;
			}
		}
		return max;
	}

	public static int CalculatesIncreasingLongestSubsequence(int[] arr, int index) {
		if (index == 0) {
			return 0;
		}
		int[] record = new int[index];
		record[0] = 1;
		int totalMax = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 1; i < index; i++) {
			for (int j = 0; j < i; j++) {
				if (record[j] > max && arr[j] < arr[i]) {
					max = record[j];
					continue;
				}
			}
			if (max == Integer.MIN_VALUE) {
				record[i] = 1;
				continue;
			}
			record[i] = max + 1;
			if (record[i] > totalMax) {
				totalMax = record[i];
			}
			max = Integer.MIN_VALUE;
		}
		if (totalMax == 1) {
			return 0;
		}
		return totalMax;
	}

	public static int CalculatesLongestDecreasingSubsequence(int[] arr, int index) {
		if (index == arr.length) {
			return 0;
		}
		int[] record = new int[arr.length - index];
		record[0] = 1;
		int totalMax = 0;
		int max = Integer.MIN_VALUE;
		for (int i = index + 1; i < arr.length; i++) {
			for (int j = index; j < i; j++) {
				if (record[j - index] > max && arr[j] > arr[i]) {
					max = record[j - index];
					continue;
				}
			}
			if (max == Integer.MIN_VALUE) {
				record[i - index] = 1;
				continue;
			}
			record[i - index] = max + 1;
			if (record[i - index] > totalMax) {
				totalMax = record[i - index];
			}
			max = Integer.MIN_VALUE;
		}
		if (totalMax == 1) {
			return 0;
		}
		return totalMax;
	}
}
