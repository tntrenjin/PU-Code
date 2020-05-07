import java.util.*;

class main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(), num[] = new int[5], coin[] = new int[] { 100, 50, 10, 5, 1 };

		for (int i = 0; i < 5; i++) {
			num[i] = n / coin[i];
			n -= num[i] * coin[i];
		}

		System.out.printf("1-%d, 5-%d, 10-%d, 50-%d, 100-%d", num[4], num[3], num[2], num[1], num[0]);
	}
}