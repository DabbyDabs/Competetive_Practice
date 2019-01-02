package numberTheory2;

public class BoringFactorialsProblem {

	public static void main(String[] args) {
int n=19;
int p=7;
int ans=givesModulusOfFactorialValue(n, p);
System.out.println(ans);
	}
public static int givesModulusOfFactorialValue(int n, int p) {
	if(n>=p) {
		return 0;
	}
	int inverseProduct=-1;
	int currInverse=1;
	for(int i=n+1;i<p;i++) {
		currInverse=(int)(findsPowerIteratively(i,p-2,p));
		inverseProduct=((inverseProduct%p)*(currInverse%p))%p;
	}
	System.out.println(inverseProduct);
	if(inverseProduct==0) {
		return 0;
	}
	return p+inverseProduct;
}
public static int findsPowerIteratively(int a, int b,int p) {
	int special =p;
	int ans = 1;
	int currIndex = a;
	int count = 0;
	while (b != 0) {
		int remainder = b % 2;
		if (remainder == 0) {
			if (count == 0) {
				b = b / 2;
				count++;
				continue;
			}
			currIndex = ((currIndex % special) * (currIndex % special)) % special;
			b = b / 2;
			count++;
			continue;
		}
		if (remainder == 1) {
			if (count == 0) {
				ans = currIndex;
				b = b / 2;
				count++;
				continue;
			}
			currIndex = ((currIndex % special) * (currIndex % special)) % special;
			ans = ((ans % special) * (currIndex % special)) % special;
			b = b / 2;
			count++;
		}

	}

	return (ans + special) % special;

}
}
//testcases
//10   
//1 3
//19 7
//10 19
//20 23
//40 61
//70 89
//45 71
//63 73
//43 47
//90 97
//Answers
//1
//0
//9
//11
//48
//30
//3
//24
//8
//26
//
