import java.util.*;

class main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char str[] = sc.nextLine().toLowerCase().toCharArray();

		int sum = 0;

		for (char c : str) {
			if (Character.isLetter(c))
				sum += c - 'a' + 1;
			else {
				System.out.print("Fail");
				return;
			}
		}

		System.out.print(sum);
	}
}