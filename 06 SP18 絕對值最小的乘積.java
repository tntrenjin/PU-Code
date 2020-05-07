import java.util.*;

class main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n[] = new int[5];
		int min = 9999;

		for (int i = 0; i < 5; i++)
			n[i] = sc.nextInt();

		for (int i = 0; i < 5; i++)
			for (int j = 0; j < 5; j++) {
				if (i == j)
					continue;
				min = Math.min(min, Math.abs(n[i]) * Math.abs(n[j]));
			}
		System.out.println(min);
	}
}