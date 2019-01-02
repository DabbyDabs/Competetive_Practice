package recursion;

public class BinarySearchUsingRecursion {

	public static void main(String[] args) {
int [] arr= {2,4,6,8,10,12,14,16,18,20};
for(int i=0;i<arr.length;i++) {
		int x=BinarySearch(arr,arr[i],0,arr.length-1);
		if(arr[x]==arr[i])
			System.out.println(x);
		else
			System.out.println(-1);
		}
	}

	public static int BinarySearch(int[] arr, int num,int startindex,int endindex) {
if(startindex==endindex) {
	return startindex;
	
}
		
		int mid = (arr.length - 1) / 2;
		int newarr[] = new int[arr.length / 2];
		if (arr[mid] > num) {
			if (arr.length % 2 == 0) {
				for (int i = 0; i <= mid; i++)
					newarr[i] = arr[i];
				endindex=startindex+mid;
				
				return BinarySearch(newarr,num,startindex,endindex);
			}
			if (arr.length % 2 != 0) {
				for (int i = 0; i < mid; i++)
					newarr[i] = arr[i];
				endindex=startindex+mid-1;
				return BinarySearch(newarr,num,startindex,endindex);
			}
			
				
		}
		if (arr[mid] < num) {

			int k = 0;
			for (int i = mid + 1; i < arr.length; i++) {
				newarr[k] = arr[i];
				k++;
			}
			startindex=startindex+mid+1;
			return BinarySearch(newarr,num,startindex,endindex);
		}
		if(arr[mid]==num) {
			return startindex+mid;
		}
		
return -100;
	}
}
