package numberTheory;

import java.util.Scanner;

public class WordBreakProblem {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
IntegerStringObject[] dictionary= new IntegerStringObject[10];
dictionary[0]=new IntegerStringObject("mobile");
dictionary[1]=new IntegerStringObject("man");
dictionary[2]=new IntegerStringObject("go");
dictionary[3]=new IntegerStringObject("mango");
dictionary[4]=new IntegerStringObject("icecream");
dictionary[5]=new IntegerStringObject("and");
dictionary[6]=new IntegerStringObject("i");
dictionary[7]=new IntegerStringObject("love");
dictionary[8]=new IntegerStringObject("ice");
dictionary[9]=new IntegerStringObject("cream");
String question="icecreamandmangomobile ";
BreakAndPrintTheWords(question,"", dictionary);

	}
	public static void BreakAndPrintTheWords(String ques,String ans,IntegerStringObject[] dictionary) {
		if(ques.length()==1) {
			System.out.println(ans);
		}
		
		int check=ques.charAt(0)-96;
		int count=0;
		int []indices=new int[dictionary.length];
		for(int i=0;i<indices.length;i++) {
			indices[i]=27;
			
		}
		int k=0;
		for(int i=0;i<dictionary.length;i++) {
			if(dictionary[i].number==check) {
				indices[k]=i;
				count++;
				k++;
			}
			}
		int m=0;
		int testcount=0;
		for(int j=0;j<count;j++) {
			String test= dictionary[indices[m]].word;
			
			for(int i=0;i<test.length();i++) {
				if(ques.charAt(i)==test.charAt(i)) {
					testcount++;
					continue;
				}
				break;
			}
			if(test.length()==testcount) {
				BreakAndPrintTheWords(ques.substring(testcount),ans+test+" ", dictionary);
			}
			testcount=0;
			m++;
		}
		
		
	}
	
}
//for(int i=0;i<dictionary.length;i++) {
//dictionary[i]=new IntegerStringObject(s.nextLine());
//}