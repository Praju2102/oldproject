package practice_program;

public class Count_NoInDigits {

	public static void main(String[] args) {
		long n = 234520070468348L, count = 0;
		// double n=3.447647d;
		while (n != 0) {
			n = n / 10;
			count++;

		}
		// TODO Auto-generated method stub
		System.out.println(count);
	}

}
