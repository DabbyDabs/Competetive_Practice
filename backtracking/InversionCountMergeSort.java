package backtracking;

public class InversionCountMergeSort {

	public static void main(String[] args) {
		int arr[]= {2,5,1,3,4};
		int count=0;
	count=	mergeSort(arr,0,arr.length-1,count);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	System.out.println();
		System.out.println(count);
	}
public static int mergeSort(int [] arr,int begin,int end,int count) {
	if(end-begin==0)
		return count;
	int mid=(end-begin)/2;
count=mergeSort(arr,begin,begin+mid,count);
count=mergeSort(arr,begin+mid+1,end,count);
	int[]duplicate= new int[end-begin+1];
	int k=0;
	int i=begin,j=begin+mid+1;
	int point1=begin;
	int point2=begin+mid+1;
	while(point1<=begin+mid && point2<=end) {
	if( arr[point1]<arr[point2]) {
		point1++;
	}
	if(arr[point1]>arr[point2]) {
		int increment= begin+mid-point1+1;
		count=count+increment;
		point2++;
	}
	}
	for(;i<=begin+mid&&j<=end;) {
		if(arr[i]>arr[j])
		{duplicate[k]=arr[j];
		k++;
		j++;
		continue;
			}
		if(arr[i]<arr[j]) {
			duplicate[k]=arr[i];
			i++;
			k++;
		}
		
	}
	if(i>begin+mid) {
		while(j<=end) {
			duplicate[k]=arr[j];
		j++;
		k++;
		}
	
	}
	if(j>end) {
		while(i<=begin+mid) {
			duplicate[k]=arr[i];
		i++;
		k++;
	}
   
}
	 k=0;
	int x=begin;
	while(x<=end) {
		arr[x]=duplicate[k++];
		x++;
	}
	return count;
	}
}
