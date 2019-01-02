package recursion;

public class PrintKeypad {

	public static void main(String[] args) {
printKeypad(456,"");
	}
	public static void printKeypad(int d,String output) {
		if(d==0) {
		System.out.println(output);
		}
		
		int temp=d;
		int count=0;	
		while(temp!=0) {
			temp=temp/10;
			count++;
		}
		int n=(pow(10,count-1));
		int m=(d/n)%10;
		if(n==1) {
			d=0;
			}
		String curr=getSequence(m);
		for(int i=0;i<curr.length();i++) {
			printKeypad(d%n,output+curr.charAt(i));
		}
		
		
	}	
		
	
	public static int pow(int x,int y) {
		int m=1;
		for(int i=0;i<y;i++) {
			m=m*x;
		}
		return m;
	}
	public static String getSequence(int i) {
		switch(i) {
		case 0:return "";
		case 1:return "";
		case 2:return "abc";
		case 3: return "def";
		case 4: return "ghi";
		case 5: return "jkl";
		case 6: return"mno";
		case 7: return "pqrs";
		case 8: return"tuv";
		case 9 : return"wxyz";
		default:return "";
		}
	}
}
