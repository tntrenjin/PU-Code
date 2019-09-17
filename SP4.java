import java.util.*;

class main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		char[] word = sc.next().toCharArray();
		
		for(int i=0;i<word.length;i++)
		{
			if((int)word[i] - 3 < 'A')
				System.out.print((char)('Z' + 'A' - (int)word[i] + 2));
			else
				System.out.print((char)((int)word[i] - 3));
		}
		System.out.println();
	}
}