import java.util.*;

class main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        LinkedList<Integer> people = new LinkedList<Integer>();

        for (int i = 0; i < n; i++)
            people.add(i + 1);

        int count = 1;
        while (people.size() != 1)
            for (int i = 0; i < people.size(); i++, count++)
                if (count % 3 == 0)
                    people.remove(i--);

        System.out.println(people.getFirst());
    }
}
