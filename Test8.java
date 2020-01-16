class Person
{
	private int Ssn;
	private String Name;
	private int Age;

	
public Person(int Ssn, String Name, int Age)
	{ 	
		this.Ssn=Ssn;
		this.Name=Name;
		this.Age=Age;
	}
	public void setSsn(int Ssn) { this.Ssn=Ssn; }
	public void setName(String Name) { this.Name=Name;}
	public void setAge(int Age) { this.Age=Age;}
	public int getSsn() { return Ssn;}
	public String getName() { return Name;}
	public int getAge() { return Age;}

	}//class Person ended
	
class Employee extends Person
{
	private int empid;
	private double salary;
	
	public Employee(int Ssn,String Name, int Age, int empid,double salary)
		{
		super(Ssn,Name,Age);
		this.empid=empid;
		this.salary=salary;
		}

			public void setEmpid(int empid) { this.empid=empid;}
			public void setSalary( double salary) {this.salary=salary;}
			public int getEmpid() { return empid; }
			public double getSalary() { return salary;}
} //cls ended


class Test8
	{	
			public static void main(String[] args)
			{
				Employee e = new Employee(100,"ashok",23,343,23232);
				System.out.println(e.getSsn());
				System.out.println(e.getName());
				System.out.println(e.getAge());
				System.out.println(e.getEmpid());
				System.out.println(e.getSalary());
				
			}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	