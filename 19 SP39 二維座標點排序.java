import java.util.*;

class Point
{
	int x, y;
	Point(){}
	Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}

class main
{
	static Point point[];

	static void swap(int x, int y)
	{
		Point tmep = point[x];
		point[x] = point[y];
		point[y] = temp;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		point = new Point[n];
		
		for(int i = 0; i < n; i++)
			point[i] = new Point(sc.nextInt(), sc.nextInt());
		
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n - 1; j++)
				if(point[j].x > point[j + 1].x)
					swap(j, j + 1);
				else if(point[j].x == point[j + 1].x && point[j].y > point[j + 1].y)
					swap(j, j + 1);
		
		for(int i = 0; i < n; i++)
			System.out.println(point[i].x + " " + point[i].y);
	}
}