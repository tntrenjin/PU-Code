import java.util.*;

class main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), count = 0;

		for (int i = 0; i <= n; i++)
			for (int j = 0; j <= n / 5; j++)
				for (int k = 0; k <= n / 10; k++)
					if (i + j * 5 + k * 10 == n)
						count++;
		System.out.println(count);
	}
}