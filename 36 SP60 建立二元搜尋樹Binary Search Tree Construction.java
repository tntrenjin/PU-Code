import java.util.*;

class main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(),
			tree[] = new int[1024],
			mh = 1;
		
		for(int i = 0; i < n; i++)
		{
			int num = sc.nextInt();
		
			for(int index = 1, h = 1; index < 1024; h++)
			{
				if(tree[index] != 0)
					if(tree[index] < num)
						index = index * 2 + 1;
					else
						index *= 2;
				else
				{
					tree[index] = num;
					mh = (h > mh ? h : mh);
					break;
				}
			}
		}
		
		System.out.println(mh);
		
		for(int i = 0; i < Math.pow(2, mh); i++)
			System.out.print(tree[i] + " ");
		System.out.println();
	}
}