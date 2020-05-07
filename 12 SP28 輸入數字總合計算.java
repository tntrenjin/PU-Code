import java.util.*;

class main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str[] = sc.nextLine().split(" ");
		int sum = 0;

		for (int i = 0; i < str.length; i++) {
			try {
				sum += Integer.valueOf(str[i]);
			} catch (Exception e) {
			}
		}

		System.out.printf("ANS= %d", sum);
	}
}