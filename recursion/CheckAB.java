package recursion;

public class CheckAB {

	public static void main(String[] args) {
System.out.println(checkAB("abbaabaabb",1));
	
	}
public static boolean checkAB(String str,int count) {
	if(count==1 && str.charAt(0)!='a')
		{return false;}
	if(str.length()==0) {
		return true;
	}
	if(str.length()==1 && str.charAt(0)=='a') {
		return true;
	}
	if(str.charAt(0)=='a') {
		return checkAB(str.substring(1),count+1);
	}
	
	if(str.charAt(0)=='b') {
		if(str.length()==1)
return false;
  if(str.charAt(1)=='b') {
	return checkAB(str.substring(2),count+1);
}
  if(str.charAt(1)!='b')
	  return false;
	}
	return false;
}
}
