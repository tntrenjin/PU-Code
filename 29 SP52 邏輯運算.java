import java.util.*;

class main
{
	static int[] bit = new int[] {0,0,0,0,0};
	
	static int[] S2B(String str)
	{
		int[] temp = new int[5];
		
		for(int i = 0; i < 5; i++)
			temp[i] = str.charAt(i) - '0';
		
		return temp;
	}
	
	static void logic(int[] x, String l)
	{	
		if(l == "and")
			for(int i = 0; i < 5; i++)
				bit[i] = bit[i] & x[i];
		else if(l == "or")
			for(int i = 0; i < 5; i++)
				bit[i] = bit[i] | x[i];
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		int i;
		
		for(i = 0, bit = S2B(str[0]); i < str.length; i++)
		{
			if(str[i].equals("and"))
			{
				System.out.print("&&");
				logic(S2B(str[i + 1]), "and");
			}
			else if(str[i].equals("or"))
			{
				System.out.print("||");
				logic(S2B(str[i + 1]), "or");
			}
			else
				System.out.print(str[i]);
		}
			
		System.out.print(" = ");
		
		for(i = 0; i < 5; i++)
			System.out.print(bit[i]);
			
		System.out.println();
	}
}