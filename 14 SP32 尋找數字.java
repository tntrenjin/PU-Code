import java.util.*;

class main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String goal = sc.next(), all = sc.next();

		int count = 0, num[] = new int[100];

		for (int i = 0, temp;;) {
			temp = all.indexOf(goal, i);

			if (temp != -1) {
				num[count++] = all.length() - temp;
				i = temp + 1;
			} else
				break;
		}

		System.out.println(count + 1);

		for (int i = 0; i <= count; i++)
			System.out.print(num[i] + " ");

		System.out.println();
	}
}