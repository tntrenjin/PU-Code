import java.util.*;

class main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		char[] ID = sc.nextLine().toCharArray();
		int[] num = new int[] {10,11,12,13,14,15,
							   16,17,34,18,19,20,
							   21,22,35,23,24,25,
							   26,27,28,29,32,30,
							   31,33};
		int X = num[ID[0] - 'A'] % 10 * 9 + num[ID[0] - 'A'] / 10;
		int Y = ID[9] - '0';
		
		for(int i = 8; i >= 1; i--)
			Y += (ID[i] - '0') * (9 - i);
			
		System.out.println((X + Y) % 10 == 0);
	}
}