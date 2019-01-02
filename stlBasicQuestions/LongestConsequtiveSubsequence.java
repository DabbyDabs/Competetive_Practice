package stlBasicQuestions;
import java.util.ArrayList;
import java.util.Arrays;
public class LongestConsequtiveSubsequence {

	public static void main(String[] args) {
		int arr1[]={4,5,6,56,0,1,2};
		returnLongestSubsequence(arr1);
	}
public static ArrayList<Integer> returnLongestSubsequence(int arr1[]) {
	ArrayList<Integer>ans=new ArrayList();
	ArrayList<Integer>record=new ArrayList();
	for(int i=0;i<arr1.length;i++) {
		record.add(arr1[i]);
	}
	int []arr=removeDuplicates(arr1);
	if(arr.length==1)
	{ans.add(arr[0]);
		return ans;
	}
	int temp=0;
	int tempLength=0;
	int flagStart=0;
	int flagEnd=0;
	int p=0;
	for(int i=1;i<arr.length;) {
		
		if(i<arr.length && i>0 && (arr[i]==arr[i-1]+1)) {
			flagStart=i-1;
			p=i;
			while(p<arr.length && arr[p]==arr[p-1]+1) {
				p++;
			}
			flagEnd=p-1;
			if((flagEnd-flagStart+1)==tempLength)
			{if(record.indexOf(arr[flagStart])<record.indexOf(arr[temp]))
				{tempLength=flagEnd-flagStart+1;
			temp=flagStart;}
			
			}
			
			if((flagEnd-flagStart+1)>tempLength)
			{tempLength=flagEnd-flagStart+1;
			temp=flagStart;}
			i=p+1;
			continue;
		}
		i++;
		
	}
	
	for(int i=temp;i<tempLength+temp;i++) {
		ans.add(arr[i]);
	}
	for(int i=0;i<ans.size();i++) {
		System.out.print(ans.get(i)+" ");
	}
	return ans;
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
	int []ans1=new int[count];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=Integer.MAX_VALUE) {
			ans1[k]=arr[i];
			k++;
		}
	}
	
	return ans1;
}
}
