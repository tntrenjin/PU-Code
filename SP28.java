import java.util.*;

class main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str[] = sc.nextLine().split(" ");
		boolean letter = false;
		int sum = 0;
		
		for(int i = 0; i < str.length; i++)
		{
			for(int j = 0; j < str[i].length(); j++, letter = false)
			{
				if(Character.isLetter(str[i].charAt(j)))
				{
					letter = true;
					break;
				}
			}
			if(!letter)
				sum += Integer.parseInt(str[i]);
		}
		
		System.out.printf("ANS= %d", sum);
	}
}