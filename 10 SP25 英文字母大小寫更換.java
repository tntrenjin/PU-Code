import java.util.*;

class main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char[] str = sc.nextLine().toCharArray();
		
		boolean flag = true;
		
		for(char c : str)
		{	
			if(c == '.')
				flag = true;
			if(Character.isLetter(c) && flag)
			{
				c = Character.toUpperCase(c);
				flag = false;
			}
			System.out.print(c);
		}
	}
}