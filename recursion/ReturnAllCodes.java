package recursion;

public class ReturnAllCodes {

	public static void main(String[] args) {
String str="1224";
String arr[]=returnCodes(str);
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]+" ");
}
	}
public static String[] returnCodes(String s) {
	if(s.length()==0) {
		String[] ans= {""};
		return ans;
	}
	if(s.length()==1) {
		String empty="";
		String[] Ans=new String[1];
		Ans[0]=empty+returnCharacter(s);
		return Ans;
	}
	if(s.length()>=2) {
	String [] Ans=returnCodes(s.substring(1));
	
	if(CheckValue(s.substring(0,2))<=26)
	{
		String[] Ans2= returnCodes(s.substring(2));
	String []finalAns= new String[Ans.length+Ans2.length];
	int k=0;
	for(int i=0;i<Ans.length;i++) {
		finalAns[k]=returnCharacter(s.substring(0,1))+Ans[i];
		k++;
	}
	for(int i=0;i<Ans2.length;i++) {
		finalAns[k]=returnCharacter(s.substring(0,2))+Ans2[i];
		k++;
	}
	return finalAns;
	}
	String [] Answer= new String[Ans.length];
	for(int i=0;i<Ans.length;i++) {
		Answer[i]=returnCharacter(s.substring(0,1))+Ans[i];
	}
	return Answer;
	}
	 
	
	return null;
	}

public static int CheckValue(String input) {
	int num = 0;
	int len = input.length() - 1;
	for (int i = 0; i < input.length(); i++) {
		num = num + ((input.charAt(i) - 48) * pow(10, len));
		len--;
	}
	return num;
}

public static int pow(int x, int y) {
	int m = 1;
	for (int i = 0; i < y; i++) {
		m = m * x;
	}
	return m;
}

public static char returnCharacter(String str) {

	if (str.length() == 1) {
		char m = (char) ((int) str.charAt(0) + 48);
		return m;
	}
	int x = (10) * (str.charAt(0) - 48);
	int y = str.charAt(1) - 48;
	int z = x + y;
	char m = (char) (z + 96);
	return m;
}
}
