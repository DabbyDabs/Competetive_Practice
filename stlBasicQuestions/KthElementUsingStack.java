package stlBasicQuestions;
import java.util.Stack;
import java.util.ArrayList;
public class KthElementUsingStack {

	public static void main(String[] args) {
int[]arr= {1,3,2,1,11,1,1,1,1,12};
	System.out.println(returnKthLargest(arr, 3));}
public static int returnKthLargest(int[]arr,int k) {
	Stack<Integer> s= new Stack();
	ArrayList<Integer>store=new ArrayList();
	s.push(arr[0]);
	for(int i=1;i<arr.length;i++) {
		if(s.peek()<=arr[i]) {
			if(s.peek()==arr[i]) {
				continue;
			}
			s.push(arr[i]);
			continue;
		}
		while(s.size()!=0 && s.peek()>arr[i]) {
			store.add(s.pop());
			}
		if(s.size()==0) {
			s.push(arr[i]);
			while(store.size()!=0)
			s.push(store.remove(store.size()-1));
		continue;
		}
		if(s.peek()<=arr[i]) {
			if(s.peek()!=arr[i])
				{s.push(arr[i]);}
			while(store.size()!=0) {
				s.push(store.remove(store.size()-1));
				}
			}
	}
	for(int i=1;i<k;i++) {
		if(s.size()>1)
		s.pop();
	}
	return s.pop();
}
}
