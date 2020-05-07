import java.util.*;

class main {
	static int f(int index) {
		if (index == 1)
			return 1;
		else if (index % 2 == 0)
			return f(index / 2) + 1;
		else
			return f(index * 3 + 1) + 1;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), max = 0, temp;

		for (int num = n, index = 0; num <= m; index++, num++)
			max = Math.max(max, f(num));

		System.out.printf("%d %d %d", n, m, max);
	}
}