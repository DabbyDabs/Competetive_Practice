package stlBasicQuestions;

public class ExtractUniqueCharacters {

	public static void main(String[] args) {
 String str= "wa&n&aq(wns(i+qn";
 System.out.println(extractUniqueCharacters(str));
	}
public static String extractUniqueCharacters(String str) {
	int[]record= new int[127];
	int value=0;
	String ans= new String();
	for(int i=0;i<str.length();i++) {
		value=str.charAt(i);
		if(record[value]==0) {
		ans=ans+str.charAt(i);
		record[value]=record[value]+1;
		}
		record[value]=record[value]+1;
			}
		
	return ans;
}
}
