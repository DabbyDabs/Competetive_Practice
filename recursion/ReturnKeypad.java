package recursion;

public class ReturnKeypad {

	public static void main(String[] args) {
int x=123;
String[] ans=returnKeypad(x);
for(int i=0;i<ans.length;i++) {
	System.out.println(ans[i]);
}
	}
public static String[] returnKeypad(int d) {

	if(d==0) {
String[] arr= {""};
return arr;
}
	int temp=d;
	int count=0;	
	while(temp!=0) {
		temp=temp/10;
		count++;
	}
	int n=(pow(10,count-1));
	int m=(d/n);
	if(n==1) {
		d=0;
	}
	String []ans=returnKeypad((d %n));
	String s=getSequence(m);
	int size=s.length();
	if(size==0) {
		size=1;
	}
	String[] newans=new String[(size)*(ans).length];
	
	int k=0;
	for(int i=0;i<size;i++) {
		if(size==1)
		{	newans=ans;
		break;}
		for(int j=0;j<ans.length;j++) {
		newans[k]=s.charAt(i)+ans[j];
		k++;
		}
	}
	return newans;
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
	default:return " ";
	}
}

}
