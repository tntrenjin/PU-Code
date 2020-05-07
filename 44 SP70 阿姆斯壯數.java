import java.util.*;

class main {
	static boolean check(int num) {
		char str[] = String.valueOf(num).toCharArray();

		int sum = 0;
		for (int i = 0; i < str.length; i++)
			sum += Math.pow((int) (str[i] - '0'), str.length);
		return sum == num;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(), n = sc.nextInt();
		boolean flag = false;

		for (int i = m; i <= n; i++)
			if (check(i)) {
				System.out.print(i + " ");
				flag = true;
			}

		if (!flag)
			System.out.print("none");
	}
}