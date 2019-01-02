package numberTheory;

import java.util.Arrays;
import java.util.Scanner;

public class MonkAndCakesProblem {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Lets start!");
		int testcases=s.nextInt();
		while(testcases>0) {
		int friends =s.nextInt();
		int typesOfCakes =s.nextInt();
		int[] capacities =new int[friends];
		for(int i=0;i<capacities.length;i++) {
			capacities[i]=s.nextInt();
		}
		Arrays.sort(capacities);
		
		int[] weight = new int[typesOfCakes];
		for(int i=0;i<weight.length;i++) {
			weight[i]=s.nextInt();
		}
		int[] frequency = new int[typesOfCakes];
		for(int i=0;i<frequency.length;i++) {
			frequency[i]=s.nextInt();
		}
		int maxweight = giveMaximumElementOfArrayAndIndex(weight, 0);
		int[] footprint = new int[maxweight + 1];
		for (int i = 0; i < weight.length; i++) {
			footprint[weight[i]] = frequency[i];
		}
		int k = 0;
		for (int i = 0; i < footprint.length; i++) {
			if (footprint[i] != 0) {
				frequency[k] = footprint[i];
				k++;
			}
		}
		Arrays.sort(weight);

		if (weight[weight.length - 1] > capacities[capacities.length - 1]) {
			System.out.println(-1);
		} else {
			int[] distributions = new int[friends];
			for (int i = weight.length - 1; i >= 0; i--) {
				int m=0;
				while(capacities[m]<weight[i]) {
					m++;
				}
				distributions = distributeCakes(distributions,m, frequency[i]);
			}
			int finalMax=Integer.MIN_VALUE;
			for (int i = 0; i < distributions.length; i++) {
                 if(distributions[i]>finalMax) {
                	 finalMax=distributions[i];
                 }
			}
            System.out.println(finalMax);
		}
	testcases--;	}
	}

	public static int[] distributeCakes(int[] distributions, int start, int cakes) {
		int minimum = Integer.MAX_VALUE;
		int minIndex = 0;
		while (cakes > 0) {
			for (int i = start; i < distributions.length; i++) {
				if (distributions[i] < minimum) {
					minimum = distributions[i];
					minIndex = i;
				}
			}
			distributions[minIndex]++;
			minimum = Integer.MAX_VALUE;
			cakes--;

		}
		
		return distributions;
	}

	public static int giveMaximumElementOfArrayAndIndex(int[] arr, int choice) {
		int max = Integer.MIN_VALUE;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				index = i;
			}
		}
		if (choice == 0)
			return max;
		else
			return index;
	}
//if you want to give input without scanner please use this code
//	int friends = 5;
//	int typesOfCakes = 5;
//	int[] capacities = {1111,222,33,444,5555};
//	Arrays.sort(capacities);
//	int[] weight = {143,223,48,456,5555}; 
//	int[] frequency = {10,24,43,28,18};

}
