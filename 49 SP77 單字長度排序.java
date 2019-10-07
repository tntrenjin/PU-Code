import java.util.*;

class main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<String> str = new ArrayList<String>();
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			String s = sc.next();
			if(!str.contains(s))
				str.add(s);
		}
		
		for(int i = 1; !str.isEmpty(); i++)
		{
			List<String> temp = new LinkedList<String>();
			for(String s : str)
				if(s.length() == i)
					temp.add(s);
			if(!temp.isEmpty())
			{
				System.out.print(i + " : ");
				for(String s : temp)
				{
					System.out.print(s + " ");
					str.remove(s);
				}
				System.out.println();
			}
		}	
	}
}