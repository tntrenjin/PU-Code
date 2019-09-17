import java.util.*;

class main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toLowerCase();
		int[] letter = new int[26];
		
		for(int i=0;i<str.length();i++)
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
				letter[str.charAt(i) - 'a']++;
		for(int i=0;i<26;i++)
			if(letter[i] != 0)
				System.out.printf("(%c,%d)", (char)(i+'a'), letter[i]);
		System.out.println();
	}
}