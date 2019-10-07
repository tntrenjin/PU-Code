import java.util.*;

class main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		short RGB[] = new short[3]; 
		
		for(int i = 0; i < 3; i++, n /= 256)
			RGB[i] = (short)((n % 256 + 5) > 255 ? 255 : (n % 256 + 5));
		
		int after = 0;
		for(int i = 0; i < 3; i++)
			after += Math.pow(256, i) * RGB[i];
			
		System.out.println(after);
	}
}