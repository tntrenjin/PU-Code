import java.util.*;

class main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char[] n = sc.next().toCharArray();
		char[] m = sc.next().toCharArray();
		
		int sum = B2D(n) + B2D(m);
		System.out.println(D2B(sum));
	}
	
	static int B2D(char[] str)
	{
		int sum = 0;
		for(int i = 0; i < str.length; i++)
			sum += Math.pow(2, str.length - i - 1) * (int)(str[i] - '0');
		return sum;
	}
	
	static String D2B(int num)
	{
		String n = "",
        	   temp = "";
        	   
		while(num != 0)
		{
			n += (num % 2);
			num = (num - num % 2) / 2;
		}
		
		for(int i = n.length() - 1; i >= 0; i--)
			temp += n.charAt(i);
        
        return temp;
	}
}