

class Employee
{
	private int empid;
	private String ename;
	double salary;
	public Employee(){}
	public Employee(int empid,String ename,double salary)
	{
		this.empid=empid;
		this.ename=ename;
		this.salary=salary;
	} 
	public String toString()
	{
		return "Empid is "+empid+"\nEname is "+ename+"\nsalary is"+salary; 
	}
}

class test
{
	public static void main(String[] args)
	{
		Employee e=new Employee(101,"ajay",25000);
		System.out.println(e);
	}
}