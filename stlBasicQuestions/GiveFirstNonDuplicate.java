package stlBasicQuestions;

public class GiveFirstNonDuplicate {

	public static void main(String[] args) {
		char c='n';
		String str="WswwWsfrt";
		c=returnFirstNonDuplicate(str);
		System.out.println(c);
		
	}
public static char returnFirstNonDuplicate(String str) {
	int[]record= new int[52];
	int value=0;
	for(int i=0;i<str.length();i++) {
		value=str.charAt(i);
		if(value>90) {
			value=value-71;
			record[value]=record[value]+1;
			continue;
		}
		value=value-65;
		record[value]=record[value]+1;
	}
	value=0;
	for(int i=0;i<str.length();i++) {
		value=str.charAt(i);
		if(value>90) {
			value=value-71;
			if(record[value]==1) {
				return str.charAt(i);
			}
			continue;
		}
		value=value-65;
if(record[value]==1)
	return str.charAt(i);
	}
return 'a';
}
}
