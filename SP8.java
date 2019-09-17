import java.util.*;

class main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str[] = new String[3];
		
		for(int i=0;i<3;i++)
			str[i] = sc.next();
		Arrays.sort(str,0,3);
		for(int i=0;i<3;i++)
			System.out.println(str[i]);
	}
}