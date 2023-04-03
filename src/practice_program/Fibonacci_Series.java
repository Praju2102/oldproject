package practice_program;
public class Fibonacci_Series 
{
 public static void main(String args[])
 {
	 int p=0,n=1,sum;
	// System.out.printf(p+"%n"+n);///printf method (line seperator)
	// System.out.println(p);
	// System.out.println(n);
	 for(int i=2;i<11;i++)
	 {
		 sum=p+n;
		 p=n;
	     n=sum;
	     System.out.println(sum);
	     //System.out.printf("%n"+sum);//printf method (line seperator)
	 }
 }
}
