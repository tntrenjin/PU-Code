import java.util.*;

class main
{
	static int f(int n)
	{
		System.out.print(n + " ");
		if(n == 1)
			return 0;
		else if(n % 2 == 0)
			f(n / 2);
		else
			f(n * 3 + 1);
		return 0;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		f(sc.nextInt());
	}
}