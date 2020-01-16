class person
{
	public int a1;
	public String name;
	public int age;
	
	public person(int a1,String name,int age)
	{
		this.a1=a1;
		this.name=name;
		this.age=age;
	}
	
}

class employee extends person
{
	public int empid;
	public double salary;

	public employee(int a1,String name,int age,int empid,double salary)
	{
		super(a1,name,age);
		this.empid=empid;
		this.salary=salary;
	}
}


class salesman extends employee
{
	public int points;
	
	public salesman(int a1,String name,int age,int empid,double salary,int points)
	{
		super(a1,name,age,empid,salary);
		this.points=points;
	} 
	public double getincentives()
	{
		return points*100;
	}
	public double gettotalsalary()
	{
		return salary+points*100;
	}
}



class Test9
{
	public static void main(String args[])
	{
		salesman x=new salesman(222,"ashok",32,12,343,765);
		System.out.println(x.a1);
		System.out.println(x.name);
		System.out.println(x.age);
		System.out.println(x.empid);
		System.out.println(x.salary);
		System.out.println(x.points);
		System.out.println(x.getincentives());
		System.out.println(x.gettotalsalary());
	
		
				
	}
}





