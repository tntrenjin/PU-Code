import java.util.*;

class main
{
	static int tree[] = new int[1025];
	static int depth = 0;
	
	static void insertBT(int num, int index, int _depth)
	{
		if(tree[index] == 0)
		{
			depth = Math.max(depth, _depth);
			tree[index] = num;
			return;
		}
		
		if(tree[index] < num)
			insertBT(num, index * 2 + 1, _depth + 1);
		else if(tree[index] > num)
			insertBT(num, index * 2, _depth + 1);
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++)
			insertBT(sc.nextInt(), 1, 1);
			
		System.out.println(depth);
		for(int i = 0; i < Math.pow(2, depth); i++)
			System.out.print(tree[i] + " ");
		System.out.println();
	}
}