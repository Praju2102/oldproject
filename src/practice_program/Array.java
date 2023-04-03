package practice_program;

public class Array {

	public static void main(String[] args) {
		int a[] = { 3, 2, 7, 6, 9, 6, 3 };
		// TODO Auto-generated method stub
		int even = 0, odd = 0, n = 4;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				// System.out.println("even");
				even++;
			} else {
				// System.out.println("odd");
				odd++;
			}

		}

		System.out.println(even);
		System.out.println(odd);
	}

}
