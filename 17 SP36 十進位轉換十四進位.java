import java.util.*;

class main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),
			len = 0;
		char[] word = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D'},
			   num = new char[100];
		
		for(len = 0; n != 0; len++)
		{
			num[len] = (char)(n % 14);
			n /= 14;
		}

		for(int i = len - 1; i >= 0; i--)
			System.out.print(word[num[i]]);
		System.out.println();
	}
}