class Employee
{
	 private int empid;
	private string name;
	private double salary;
	public Employee() {}
public Employee (int empid, string name, double salary)
		{
		public void setEmpid(int empid)
		{
		this.empid=empid; 
		}
	
	
		public void setEname { this.name=name; }
		public void setSalary { this.salary=salary; }
		
		
		
		
	public int getEmpid() { return empid;}
	public string getName() { return name;}
	public double getSalary() { return salary;}
		}
	
	
}
class Department
{
int deptno;
string deptname;
Employee[] e;
}
public Department(){}

public Department( int deptno, string deptname, Employee[] e)
	{ 
	this.deptno=deptno; this.deptname=deptname; this.e=e;
	}

	public void setDeptno(int deptno){this.deptno=deptno;}
	public void setDeptname(string deptname){this.deptname=deptname;}
	public void setEmployee(Employee[] e) {this.e=e;}
	public int getDeptno() { return deptno;}
	public string getDeptname() { return deptname;}
	public Employee getEmployee[]() { return e;}


class Test5
{
	public static void main(String[] args)
	{ 
	Employee[] e1={new Employee(101,"dj",1000),new Employee(100,"dj2",200), new Employee(232,"dj3",2334)};
	department d = new department(100,"sales", e1);
	System.out.println("deptno is"+d.getDeptno());
	System.out.println("deptname is"+d.getDeptname());
	System.out.println("emp details");
	
	
	for(int i=0;i<e2.length;i++)
	{
	
	
	
	System.out.println("empid id is"+d.getEmployee().getEmpid());
	System.out.println("ename is"+d.getEmployee().getEname());
	System.out.println("esalary is"+d.getEmployee().getSalary());
	}



	

}