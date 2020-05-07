import java.util.*;

class main {
	public static int cal(String type, int x, int y) {
		switch (type) {
			case "+":
				return x + y;
			case "-":
				return x - y;
			case "*":
				return x * y;
			case "/":
				return x / y;
		}
		return 0;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		LinkedList<Integer> stack = new LinkedList<Integer>();

		for (String c : str) {
			if ("+-*/".indexOf(c) != -1) {
				int y = stack.removeLast();
				int x = stack.removeLast();
				stack.add(cal(c, x, y));
			} else
				stack.add(Integer.parseInt(c));
		}

		System.out.println(stack.getLast());
	}
}