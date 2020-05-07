import java.util.*;

class main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(), sum = 0, min, last = 0;
		String str = "";

		for (int i = 1, count = 0;; i++) {
			min = 999;

			for (int j = 0; j < i; j++, count++) {
				int temp = sc.nextInt();
				if (temp < min && Math.abs(last - j + 1) <= 1) {
					last = j;
					min = temp;
				}
			}

			sum += min;

			if (count < n)
				str += min + "+";
			else {
				str += min + "=" + sum;
				break;
			}
		}

		System.out.println(str);
	}
}
