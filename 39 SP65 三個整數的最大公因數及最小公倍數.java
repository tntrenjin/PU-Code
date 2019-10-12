import java.util.*;

class main
{	
	static int gcd(int m, int n)
	{
		return n == 0 ? m : gcd(n, m % n);
	}
	
	static int lcm(int m, int n)
	{
		return m * n / gcd(m, n);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(),
			y = sc.nextInt(),
			z = sc.nextInt();
			
		int max = gcd(gcd(x, y), z),
			min = lcm(lcm(x, y), z);
			
		System.out.println(max + " " + min);
	}
}