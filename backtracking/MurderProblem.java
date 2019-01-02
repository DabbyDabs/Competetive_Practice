package backtracking;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Scanner;

public class MurderProblem {

	public static void main(String[] args) {
		int ans = 0;
		int sum = 0;
		Stack<Integer> s = new Stack<>();
		ArrayList<Integer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of test cases::");
		int n = scan.nextInt();
		while (n != 0) {
			ans = 0;
			sum = 0;
			while (!s.empty()) {
				s.pop();
			}
			System.out.println("Enter the size of stairs::");
			int N = scan.nextInt();
			int[] arr = new int[N];
			System.out.println("Enter the numbers on stairs respectively::");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scan.nextInt();
			}
			sum = arr[0];
			s.push(arr[0]);
			for (int i = 1; i < arr.length; i++) {
				if (s.peek() <= arr[i]) {
					if (s.peek() != arr[i]) {
						ans = ans + sum;
					}
					if (s.peek() == arr[i]) {
						ans = ans + sum - arr[i];
					}
					sum = sum + arr[i];
					s.push(arr[i]);
					continue;

				}
				if (s.peek() > arr[i]) {
					while (s.size() != 0 && s.peek() >= arr[i]) {
						sum = sum - s.peek();
						list.add(s.pop());
					}
					ans = ans + sum;
					s.push(arr[i]);
					sum = sum + arr[i];
					while (list.size() != 0) {
						s.push(list.remove(list.size() - 1));
						sum += s.peek();
					}
				}

			}
			System.out.println(ans);
			n--;
		}
	}
}
