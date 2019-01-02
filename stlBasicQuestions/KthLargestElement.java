package stlBasicQuestions;
import java.util.Arrays;
public class KthLargestElement {

	public static void main(String[] args) {
int [] arr= {2 ,6 ,10 ,20 ,13 ,4 ,1 ,20};
System.out.println(returnKthLargest(arr, 1));
	}
public static int returnKthLargest(int[]arr,int k) {
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
		int p=0;
		int []ans=new int[count];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=Integer.MAX_VALUE) {
				ans[p]=arr[i];
				p++;
			}
		}
		
		return ans[ans.length-k];
}
}
