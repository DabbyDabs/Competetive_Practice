package recursion;

public class RemoveConsequtiveDuplicates {

	public static void main(String[] args) {
String s="abhbbddefffe";
System.out.println(removeConsecutiveDuplicates(s));
	}
	public static String removeConsecutiveDuplicates(String s) {
		if(s.length()==1) {
			return s.substring(0);
		}
		else if(s.length()==2&&s.charAt(0)==s.charAt(1)) {
			 s=s.substring(1);
			 return s;
		}
		else if(s.charAt(0)==s.charAt(1)) {
			 s=removeConsecutiveDuplicates(s.substring(1));
		}
		else
	 s=s.charAt(0)+removeConsecutiveDuplicates(s.substring(1));
		return s;
	}
}
