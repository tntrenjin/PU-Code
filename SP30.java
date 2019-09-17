import java.util.Scanner;

class main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),times;
		String str;
		System.out.print(n + "=");
		
		for(int i=2;n != 1;i++)
		{	
			times = 0;
			str = "";
			while(n%i == 0)
			{
				n /= i;
				times++;
			}
			
			if(times > 0)
			{
				str += i;
				str += (times > 1 ? "^" + times : "");
				str += (n == 1) ? "" : "*";
				
				System.out.print(str);
			}
		}
		
		System.out.println();
	}
}