import java.util.*;

class main
{
	static int tree[] = new int[17];
	static int depth = 0;
	
	static void swap(int x, int y)
	{
		int temp = tree[x];
		tree[x] = tree[y];
		tree[y] = temp;
	}
	
	static void max(int index)
	{
		if(tree[index * 2] > tree[index] && tree[index * 2] > tree[index * 2 + 1])
			swap(index * 2, index);
		else if(tree[index * 2 + 1] > tree[index] && tree[index * 2 + 1] > tree[index * 2])
			swap(index * 2 + 1, index);
	}
	
	static void f(int index, int insert, int _depth)
	{
		depth = Math.max(depth, _depth);
		if(index * 2 >= tree.length || index * 2 + 1 >= tree.length || index > insert)
			return;
		
		if(tree[index * 2] != 0)
		{
			max(index);
			f(index * 2, insert, _depth + 1);
		}
		
		if(tree[index * 2 + 1] != 0)
		{
			max(index);
			f(index * 2 + 1, insert, _depth + 1);
		}
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int input[] = new int[n + 1];
		
		for(int i = 1; i <= n; i++)
			input[i] = sc.nextInt();
		
		for(int i = 1; i <= n; i++)
		{
			tree[i] = input[i];
			f(1, i, 1);
		}
		
		System.out.println(depth);
		for(int i = 0; i < Math.pow(2, depth); i++)
			System.out.print(tree[i] + " ");
	}
}