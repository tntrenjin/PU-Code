import java.util.Scanner;

class main
{
	public static boolean isLetter(char word)
	{
		if((word >= 'a' && word <= 'z') || (word >= 'A' && word <= 'Z'))
			return true;
		else
			return false;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char[] str = sc.nextLine().toCharArray();
		
		for(int i = 0, index = 0; i < str.length; i++)
		{
			if(!isLetter(str[i]))
			{
				for(int j = i - 1; j >= index; j--)
					System.out.print(str[j]);
				System.out.print(str[i]);
				index = i + 1;
			}
		}
		System.out.println(" ");
	}
}