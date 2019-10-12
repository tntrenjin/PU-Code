import java.util.Scanner;

class main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char[] str = sc.nextLine().toCharArray();
		
		for(int i = 0, index = 0; i < str.length; i++)
		{
			if(!Character.isLetter(str[i]))
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
