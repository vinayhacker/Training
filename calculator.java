interface Calculator
{
	int sum(int x, int y);
	int product(int x, int y);
}




class Abccalc implements Calculator
{
	public int sum(int x, int y)
	{
	return x+y;
	}
	
	public int product(int x, int y)
		{
		return x*y;
		}
		
}



class Xyzcalc implements Calculator
{
public int sum(int x, int y)
	{
return (x-(-y));
	}
public int product(int x, int y)
	{
	return (x*y);
	}
}



class Calculator2
{
public static void main(String[] args)
{
int x = 2;
int y = 3;
Calculator c = new Calculator();
System.out.println(c.sum);
System.out.println(c.product);
}
}