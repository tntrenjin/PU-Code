import java.util.*;

class main
{
	static int node[];
	static int root = 0;
	static int leave = 0;
	
	static int tree(int index)
	{
		if(index >= node.length)return 0;
		if(node[index] == 0)	return 0;
		if(tree(index * 2) + tree(index * 2 + 1) > 0)
			root++;
		else
			leave++;
		return 1;
	}

	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		node = new int[n];
		
		for(int i = 0; i < n; i++)
			node[i] = sc.nextInt();
			
		tree(1);
		System.out.print(root + "\r\n" + leave + "\r\n");
	}
}