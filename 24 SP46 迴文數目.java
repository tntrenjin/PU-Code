import java.util.*;

class main
{
	static int f(int n)
	{
		if(n == 1 || n == 0)
			return 1;
		return n * f(n - 1);
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char str[] = sc.next().toCharArray();
		int letter[] = new int[26],
			odd_letter = 0;
		
		for(int i = 0; i < str.length; i++)
			letter[str[i] - 'a']++;
			
		for(int i = 0; i < 26; i++)
			if(letter[i] % 2 == 1)
				odd_letter++;
			
		if(odd_letter > 1)
			System.out.println(0);
		else
		{	
			int x = f(str.length / 2),
				y = 1;
				
			for(int i = 0; i < 26; i++)
				y *= f(letter[i] / 2);
				
			System.out.println(x / y);
		}
	}
}