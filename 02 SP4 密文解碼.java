import java.util.*;

class main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char[] str = sc.next().toCharArray();

		for (int i = 0; i < str.length; i++)
			if (str[i] - 3 < 'A')
				System.out.print((char) ('Z' + str[i] - 'A' - 2));
			else
				System.out.print((char) (str[i] - 3));
		System.out.println();
	}
}
