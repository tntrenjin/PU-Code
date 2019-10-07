import java.util.*;

class Pos
{
	int x, y;
	
	Pos(){}
	
	Pos(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public String toString()
	{
		return "(" + x + "," + y + ")";
	}
}

class main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Pos[] point = new Pos[n];
		LinkedList<Pos> dominate = new LinkedList<Pos>();
		
		for(int i = 0; i < n;i ++)
		{
			point[i] = new Pos(sc.nextInt(), sc.nextInt());
		}
		
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n - 1; j++)
				if(point[j].x > point[j + 1].x)
				{
					Pos temp = point[j];
					point[j] = point[j + 1];
					point[j + 1] = temp;
				}
		
		for(int i = 0; i < n; i++)
		{
			int count = 0;
			for(int j = 0; j < n; j++)
			{
				if(i == j)
					continue;
				if(point[j].x >= point[i].x && point[j].y >= point[i].y)
					count++;
			}
			if(count == 0)
				dominate.add(point[i]);
		}
		
		System.out.println("Dominate Point: " + dominate.size());
		for(Pos p : dominate)
			System.out.println(p);
	}
}