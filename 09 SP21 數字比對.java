import java.util.*;

class main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(),
			num[] = new int[10000];
		
		for(int i = 0; i < 10000; i++)
			num[i] = 0;
		for(int i = 0; i < n; i++)
			num[sc.nextInt()]++; 
		for(int i = 0; i < 10000; i++)
			if(num[i] > 1)
				System.out.println(i + " " + num[i]);
	}
}