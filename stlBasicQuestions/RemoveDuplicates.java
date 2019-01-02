package stlBasicQuestions;
import java.util.Arrays;
public class RemoveDuplicates {

	public static void main(String[] args) {
int[]arr= {3,1,1,2,2,1};
removeDuplicates(arr);
	}
public static int[] removeDuplicates(int[]arr) {
	Arrays.sort(arr);
	int temp=arr[0];
	int count=1;
	for(int i=1;i<arr.length;) {
		if(arr[i]==temp) {
			arr[i]=Integer.MAX_VALUE;
			i++;
			continue;
		}
		temp=arr[i];
		count++;
		i++;
		
	}
	int k=0;
	int []ans=new int[count];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=Integer.MAX_VALUE) {
			ans[k]=arr[i];
			k++;
		}
	}
	for(int i=0;i<ans.length;i++) {
		System.out.print(ans[i]+" ");
	}
	return ans;
}
}
