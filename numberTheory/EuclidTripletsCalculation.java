package numberTheory;

public class EuclidTripletsCalculation {

	public static void main(String[] args) {
int a=3;
int b=2;
EuclidTriplet ans=GCDAdvanced(a, b);
System.out.println("GCD of given numbers:"+ans.gcd);
System.out.println(ans.x);
if(ans.gcd==1) {
	System.out.println("Multiplicative Modulo Inverse of "+a+" while taking modulo with "+b +" is "+ ans.x);
	System.out.println("Multiplicative Modulo Inverse of "+b+" while taking modulo with "+a+" is "+ ans.y);
}
System.out.println(ans.y);


	}
public static EuclidTriplet GCDAdvanced(int a,int b) {
	if (b > a) {
		int temp1 = b;
		b = a;
		a = temp1;
	}
	if(b==0) {
		EuclidTriplet ans=new EuclidTriplet();
		ans.gcd=a;
		ans.x=1;
		ans.y=0;
		return ans;
		}
	
	EuclidTriplet smallAns=GCDAdvanced(b,a%b);
	int temp=0;
	temp=smallAns.x;
	smallAns.x=smallAns.y;
	smallAns.y=temp-(a/b)*smallAns.y;
	return smallAns;
	
}
}
