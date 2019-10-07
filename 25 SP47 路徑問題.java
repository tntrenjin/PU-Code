import java.util.*;

class main
{
    public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        int map[][] = new int[x + 1][y + 1];
        
        for(int i = 0; i <= x; i++)
        	map[i][0] = 1;
        
        for(int i = 1; i <= x; i++)
        	for(int j = 1; j <= y; j++)
        		if(i >= j)
        			map[i][j] = map[i - 1][j] + map[i][j - 1] + map[i - 1][j - 1];
     
       	System.out.println(y > x ? map[x][x] : map[x][y]);
    }
}