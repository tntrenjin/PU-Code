import java.util.*;

class main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(), sum = 0;

		for (int i = 1; i < n; i++)
			if (n % i == 0)
				sum += i;

		if (sum > n)
			System.out.println("盈數");
		else if (sum < n)
			System.out.println("虧數");
		else if (sum == n)
			System.out.println("完全數");
	}
}