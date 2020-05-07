import java.util.*;

class main {
	static int B2D(String s) {
		int temp = 0;

		for (int i = 0; i < s.length(); i++)
			temp += Math.pow(2, s.length() - i - 1) * (s.charAt(i) - '0');

		return temp;
	}

	static String D2B(int n) {
		String temp = "", str = "";

		for (int i = n; i != 0; i /= 2)
			temp += i % 2;

		for (int i = temp.length() - 1; i >= 0; i--)
			str += temp.charAt(i);

		return str;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next(), b = sc.next();

		System.out.println(D2B(B2D(a) + B2D(b)));
	}
}