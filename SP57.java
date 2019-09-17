import java.util.*;

class main
{
	static int[] tree;

	static void f1(int n)
	{
		if(n >= tree.length || tree[n] == 0) return;
		
		System.out.print(tree[n] + " ");
		f1(n * 2);
		f1(n * 2 + 1);
	}

	static void f2(int n)
	{
		if(n >= tree.length || tree[n] == 0) return;
	
		f2(n * 2);
		System.out.print(tree[n] + " ");
		f2(n * 2 + 1);
	}
	
	static void f3(int n)
	{
		if(n >= tree.length || tree[n] == 0) return;
	
		f3(n * 2);
		f3(n * 2 + 1);
		System.out.print(tree[n] + " ");
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		tree = new int[n];
		
		for(int i = 0; i < n; i++)
			tree[i] = sc.nextInt();
			
		f1(1);
		System.out.println();
		f2(1);
		System.out.println();
		f3(1);
		System.out.println();
	}
}