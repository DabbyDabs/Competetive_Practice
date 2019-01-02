package tests;

public class PalindromeSubstrings {

	public static void main(String[] args) {
String s="abcd";
//System.out.println(CheckPalindrome("aaaa"));
PrintAllPossibleSubstrings(s);
	}
public static void PrintAllPossibleSubstrings(String s) {
	int count=s.length();
	int gap=2;
	while(gap<=s.length()) {
		int start=0;
		int end=start+gap;
		while(end!=s.length()+1) {
			//System.out.println(s.substring(start,end));
			if(CheckPalindrome(s.substring(start,end))==true) {
				count++;
			}
			start++;
			end++;
		}
		
		
	gap++;	
	}
	System.out.println(count);
}
public static boolean CheckPalindrome(String s) {
	if(s.length()==1) {
		return true;
	}
	
	for(int i=0;i<s.length()/2;i++) {
		if(s.charAt(i)==s.charAt(s.length()-i-1)) {
			continue;}
			else 
				return false;
		
	}
	return true;
}
}
