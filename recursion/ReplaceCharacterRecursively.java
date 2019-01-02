package recursion;

public class ReplaceCharacterRecursively {

	public static void main(String[] args) {
String str="abcacdefa";
char c1='a';
char c2='x';
System.out.println(replaceCharacter(str, c1, c2));
	}
	public static String replaceCharacter(String input, char c1, char c2) {
		if(input.length()==0)
			return "";
		if(input.charAt(0)==c1) {
			input=c2+replaceCharacter(input.substring(1), c1, c2);
		}
		else
			{input=input.charAt(0)+replaceCharacter(input.substring(1), c1, c2);}
			
		return input;
	}
	public static String replaceCharacter2(String input,char c1, char c2) {
		if(input.length()==0)
			return "";
		if(input.charAt(input.length()-1)==c1) {
			input=replaceCharacter2(input.substring(0, input.length()-1), c1, c2)+c2;
		}
		else
		input=replaceCharacter2(input.substring(0, input.length()-1), c1, c2)+input.charAt(input.length()-1);
		return input;
	}
}
