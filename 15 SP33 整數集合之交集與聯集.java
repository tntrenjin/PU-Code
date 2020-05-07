import java.util.*;

class main {
	static void printc(ArrayList N) {
		for (int i = 0; i < N.size(); i++) {
			System.out.print(N.get(i));
			if (i != N.size() - 1)
				System.out.print(",");
		}
		System.out.println();
	}

	static boolean contain(ArrayList<String> A, ArrayList<String> B) {
		for (String str : A)
			if (!B.contains(str))
				return false;
		return true;
	}

	static void all_con(ArrayList<String> A, ArrayList<String> B) {
		ArrayList<String> temp = new ArrayList<String>();
		for (String str : A)
			if (B.contains(str))
				temp.add(str);
		printc(temp);
	}

	static void all(ArrayList<String> A, ArrayList<String> B) {
		ArrayList<String> temp = A;
		for (String str : B)
			if (!temp.contains(str))
				temp.add(str);
		Collections.sort(temp);
		printc(temp);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int group;
		String temp;
		ArrayList<String> A = new ArrayList<String>();
		ArrayList<String> B = new ArrayList<String>();

		// Input
		while (sc.hasNext()) {
			group = sc.nextInt();
			temp = sc.next();

			if (group == 1)
				A.add(temp);
			else
				B.add(temp);
		}

		Collections.sort(A);
		Collections.sort(B);

		printc(A);
		printc(B);
		System.out.println((contain(A, B)) ? "A屬於B" : "A不屬於B");
		all_con(A, B);
		all(A, B);
	}
}