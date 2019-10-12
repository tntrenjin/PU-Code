import java.util.*;

class main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String clear = "";
		
		for(char s : str.toCharArray())
			if(Character.isLetter(s))
				clear += s;
		
		for(int i = 0, clearIndex = clear.length() - 1; i < str.length(); i++)
		{
			char nowChar = str.charAt(i);
			boolean now_lowerCase = true;
			boolean shift_lowerCase = true;
			
			if(!Character.isLetter(nowChar))
			{
				System.out.print(nowChar);
				continue;
			}
			
			char shiftChar = clear.charAt(clearIndex++ % clear.length());
			
			if(nowChar >= 'A' && nowChar <= 'Z')
				now_lowerCase = false;
			if(shiftChar >= 'A' && shiftChar <= 'Z')
				shift_lowerCase = false;
			
			if(now_lowerCase && !shift_lowerCase)
				System.out.print((char)(shiftChar - ('A' - 'a')));
			else if(!now_lowerCase && shift_lowerCase)
				System.out.print((char)(shiftChar + ('A' - 'a')));
			else
				System.out.print(shiftChar);
			
		}
		
		System.out.println();
	}
}
