import java.util.*;

class main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] num = new int[n][2];
		
		for(int i=0;i<n;i++)
		{
			num[i][0] = sc.nextInt();
			num[i][1] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(num[j][0] > num[j+1][0])
				{
					int temp = num[j][0];
					num[j][0] = num[j+1][0];
					num[j+1][0] = temp;
					temp = num[j][1];
					num[j][1] = num[j+1][1];
					num[j+1][1] = temp;
				}
				else if(num[j][0] == num[j+1][0] && num[j][1] > num[j+1][1])
				{
					int temp = num[j][1];
					num[j][1] = num[j+1][1];
					num[j+1][1] = temp;
				}
			}
		}
		
		for(int i=0;i<n;i++)
			System.out.println(num[i][0] + " " + num[i][1]);
	}
}