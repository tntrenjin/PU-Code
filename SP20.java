import java.util.*;

class main
{
    	static int GCD(int n, int m)
	{
		return n % m == 0 ? m : GCD(m, n % m);
	}
	
	static int LCM(int n, int m)
	{
		return n * m / GCD(n, m);
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(),
			m = sc.nextInt();
		
		System.out.println("最大公因數:" + GCD(n, m) + ",最小公倍數:" + LCM(n, m));
	}
}
