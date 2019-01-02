package backtracking;

import java.util.ArrayList;
import java.util.Stack;

public class InversionCount {

	public static void main(String[] args) {
int [] arr= {2, 5, 1, 3 ,4};
System.out.println(CountInversions(arr));
	}
	public static int CountInversions(int [] arr) {
		int count=0;
		Stack<Integer> s= new Stack<>();
	ArrayList<Integer> list= new ArrayList<>();	
		s.push(arr[0]);
		for(int i=1;i<arr.length;i++) {
			if(s.peek()<arr[i]) {
				s.push(arr[i]);
			}
			if(s.peek()>arr[i]) {
				while(s.size()!=0 && s.peek()>arr[i]) {
					list.add(s.pop());
					count++;
				}
				s.push(arr[i]);
				while(list.size()!=0) {
					s.push(list.remove(list.size()-1));
				}
			}
			
		}
		return count;
	}

}
