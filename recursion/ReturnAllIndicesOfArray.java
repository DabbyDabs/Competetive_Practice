package recursion;

public class ReturnAllIndicesOfArray {

	public static void main(String[] args) {
int [] arr= {1,2,1,3,1,4,2,1};
int []Ans=returnAllIndices(arr, 1,arr.length-1);
for(int i=0;i<Ans.length;i++) {
	System.out.println(Ans[i]+" ");
}
	}
	public static int [] returnAllIndices(int []arr,int x, int index){
	      
	      if(index==0){
	        if(arr[index]==x) {
	        	int[] arrAns=new int[1];
	        	arrAns[0]=0;
	        	return arrAns;
	        }
	          int []arrAns=new int[0];
	          return arrAns;
	          
	      }
	     int[] arrAns=returnAllIndices(arr,x,index-1);
	      if(arr[index]==x){
	        int[] newans=new int[arrAns.length+1];
	        for(int i=0;i<arrAns.length;i++){
	          newans[i]=arrAns[i];
	        }
	        newans[newans.length-1]=index;
	        return newans;
	      }
	      return arrAns;
	      
	    }
}
