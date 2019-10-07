import java.util.*;

class main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String _q = sc.next(),
			  _ans = sc.next();
		char[] q   = _q.toCharArray(),
			   ans = _ans.toCharArray();
		int	a = 0,
			b = 0;
			
		for(int i = 0; i < 4; i++)
			for(int j = 0; j < 4; j++)
				if(i == j && q[i] == ans[j])
					a++;
				else if(i != j && q[i] == ans[j])
					b++;
		System.out.printf("%dA%dB\r\n猜數：%s\r\n解答：%s\r\n", a, b, _ans, _q);
	}
}