import java.util.*;

class main {
	static final int max_length = Integer.MAX_VALUE - 2;
	static boolean array[] = new boolean[max_length];

	static void f(long n) {
		if (n >= max_length)
			return;
		if (array[(int) n])
			return;

		array[(int) n] = true;

		if (n * 2 >= (long) max_length)
			return;

		f(n * 2);
		f(n * 3);
		f(n * 5);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		f(1);

		int count = 0, end = 1;
		for (int i = 1; i < max_length && count < n; i++) {
			if (array[i]) {
				count++;
				end = i;
			}
		}
		System.out.print(n + " " + end);
	}
}