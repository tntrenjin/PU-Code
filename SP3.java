import java.util.*;

class main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str[] = new String[2];
		int time[][] = new int[2][3];
		// Y/M/D
		
		for(int i=0;i<2;i++)
		{
			str[i] = sc.next();
			String[] temp = str[i].split("/");
			
			time[i][0] = Integer.parseInt(temp[2]);
			time[i][1] = Integer.parseInt(temp[0]);
			time[i][2] = Integer.parseInt(temp[1]);
		}
		
		for(int i=0;i<3;i++)
		{
			if(time[0][i] > time[1][i])
			{
				System.out.println("After");
				return;
			}
			else if(time[0][i] < time[1][i])
			{
				System.out.println("Before");
				return;
			}
		}
		
		System.out.println("Same");
	
	}
}