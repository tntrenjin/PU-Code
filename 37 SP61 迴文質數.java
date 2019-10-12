import java.util.*;

class main
{
	static boolean num(int n)
	{
		for(int i = 2; i < n / 2; i++)
			if(n % i == 0)
				return false;
		return true;
	}

	static boolean loop(int n)
	{
		char[] str = String.valueOf(n).toCharArray();
		for(int i = 0; i < str.length / 2; i++)
			if(str[i] != str[str.length - i - 1])
				return false;
		return true;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print((num(n) && loop(n)) ? "YES" : "NO");
		
	}
}