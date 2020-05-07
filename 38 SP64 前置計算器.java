import java.util.*;

class main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String[] str = sc.nextLine().split(" ");
		LinkedList<Double> stack = new LinkedList<Double>();

		for (int i = str.length - 1; i >= 0; i--) {
			if (str[i].equals("$") || str[i].equals("%")) {
				Double x = stack.removeLast();
				Double y = stack.removeLast();

				if (str[i].equals("$"))
					stack.add((x + y) / 2.0);
				else
					stack.add((x - y) / 2.0);
			} else
				stack.add(Double.valueOf(str[i]));
		}

		System.out.printf("%.6f\r\n", stack.getLast());
	}
}