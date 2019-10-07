import java.util.*;

class main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		short bytes[] = new short[4];
		
		for(int i = 0; i < 4; i++, n /= 256)
			bytes[i] = (short)(n % 256);
			
		short temp = bytes[0];
		bytes[0] = bytes[2];
		bytes[2] = temp;
		
		int after = 0;
		for(int i = 0; i < 4; i++)
			after += Math.pow(256, i) * bytes[i];
		
		System.out.println("> 對調後 : " + after);
	}
}