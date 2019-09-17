import java.util.*;

class main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(),
			num[] = new int[5];
		
		num[0] = n / 100;
		n -= num[0] * 100;
		num[1] = n / 50;
		n -= num[1] * 50;
		num[2] = n / 10;
		n -= num[2] * 10;
		num[3] = n / 5;
		n -= num[3] * 5;
		num[4] = n;
		
		System.out.printf("1-%d, 5-%d, 10-%d, 50-%d, 100-%d",num[4],num[3],num[2],num[1],num[0]);
	}
}