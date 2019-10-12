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
		String str1[] = sc.next().split("/"),
		       str2[] = sc.next().split("/");
			   
		// [0] 分子 [1] 分母
		int num1[] = new int[] {Integer.parseInt(str1[0]), Integer.parseInt(str1[1])},
			num2[] = new int[] {Integer.parseInt(str2[0]), Integer.parseInt(str2[1])};
		
		// 通分
		if(num1[1] != num2[1])
		{
			int lcm = LCM(num1[1], num2[1]);
			num1[0] = num1[0] * (lcm / num1[1]);
			num2[0] = num2[0] * (lcm / num2[1]);
			num1[1] = lcm;
		}
		
		// 合併
		num1[0] += num2[0];
		
		// 約分
		for(int temp = GCD(num1[0], num1[1]); temp != 1; num1[0] /= temp, num1[1] /= temp)
			temp = GCD(num1[0], num1[1]);
		
		System.out.printf("%d/%d\r\n", num1[0], num1[1]);
	}
}
