package numberTheory;

public class IntegerStringObject {
int number;
String word;

public IntegerStringObject(String s) {
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