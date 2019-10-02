import java.util.*;

class main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(),
			pos[][] = new int[n][2];
		double	min = 9999;
		
		for(int i = 0; i < n; i++)
			for(int j = 0; j < 2; j++)
				pos[i][j] = sc.nextInt();
		
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				if(i != j)
					min = Math.min(min, Math.sqrt(Math.pow(pos[i][0] - pos[j][0], 2) + Math.pow(pos[i][1] - pos[j][1], 2)));
					
		System.out.printf("%.1f", min);
	}
}