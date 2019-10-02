import java.util.*;

class main
{
    static int GCD(int m, int n)
	{
		return n == 0 ? m : GCD(n, m % n);
	}
	
	static int LCM(int m, int n)
	{
		return m * n / GCD(m, n);
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt(),
			n = sc.nextInt();
		
		System.out.println("最大公因數:" + GCD(m, n) + ",最小公倍數:" + LCM(m, n));
	}
}
