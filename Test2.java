class Employee
{
		private String ename;
		private int empid;
		double esalary;
		public Employee(){} //constructors must be public
		public Employee(int empid, String ename, double esalary)
		{
		this.empid=empid;
		this.ename=ename;
		this.esalary=esalary;
		}
	public String toString()
	{
		return "empid is "+empid+"\nEname is "+ename+"\nEsalary is "+esalary+"";
	}
}
	class Test2
		{
			public static void main(String args[])
			{	
			Employee e =  new Employee(100,"ashok",10000);
			
			System.out.println(e);
			}
		}
				
				
				
			//Employee e1 = new Employee(); //will be initialised with default, e1 is a reference viariable;
		
			//Employee e2 = new Employee(100,"ashok",10000) // here e2 constructor has some parameters

	


