import java.util.*;

class main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String[] str = sc.nextLine().split(" ");
		double M = 0.0,
			   N = 0.0;
		
		for(int i = 0; i < str.length; i++)
		{
			String[] temp = str[i].split(":");
			
			int _m = Integer.valueOf(temp[0]);
			double _n = Double.valueOf(temp[1]);
			 
			M += (_m % 2 == 1) ? _n : 0.0;
			N += (_m % 2 == 0) ? _n : 0.0;
		}
		
		System.out.println((float)(M - N));
	}
}