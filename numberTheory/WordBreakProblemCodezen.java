package numberTheory;
import java.util.Scanner;
class IntegerStringObjects {
	int number;
	String word;

	public IntegerStringObjects(String s) {
		word=s;
		int trace=s.charAt(0);
		if(trace<91) {
			number=trace-64;
		}
		else {
			number=trace-96;
		}
	}
	}

public class WordBreakProblemCodezen {
	
public static void main(String[] args) {
		System.out.println("lets start!!!");
		Scanner s= new Scanner(System.in);
		int dictionarysize=s.nextInt();
IntegerStringObjects[] dictionary= new IntegerStringObjects[dictionarysize];
for(int i=0;i<dictionary.length;i++) {
	dictionary[i]=new IntegerStringObjects(s.nextLine());
}
String question=s.nextLine();
question=question+" ";
BreakAndPrintTheWords(question,"", dictionary);

	}
	public static void BreakAndPrintTheWords(String ques,String ans,IntegerStringObjects[] dictionary) {
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
