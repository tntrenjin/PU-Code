import java.util.*;

class main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),
			num[] = new int[n];
		
		for(int i = 0; i < n; i++)
			num[i] = sc.nextInt();
			
		int pre = 0,
			suf = n - 1,
			count = 0,
			sum = 0;
		
		while(pre < n && suf >= 0)
		{
			if(sum > 0)
				sum -= num[suf--];
			else if(sum < 0)
				sum += num[pre++];
			else
			{
				count++;
				sum += num[pre++] - num[suf--];
			}
		}
		
		System.out.print(count);
	}
}