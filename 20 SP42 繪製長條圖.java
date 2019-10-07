import java.util.*;

class main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int level[] = new int[5],
			num, max = 0;
		
		for(int i = 0; i < 20; i++)
		{
			num = sc.nextInt();
			if(num >= 90 && num <= 100)
				level[4]++;
			else if(num >= 80)
				level[3]++;
			else if(num >= 70)
				level[2]++;
			else if(num >= 60)
				level[1]++;
			else
				level[0]++;
		}
		
		for(int i = 0; i < 5; i++)
			max = Math.max(max, level[i]);
			
		for(int i = max; i > 0; i--)
		{
			for(int j = 0; j < 5; j++)
			{
				if(level[j] >= i)
					System.out.print("*");
				else
					System.out.print(" ");
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("- - - - -");
		System.out.print("E D C B A");
	}
}