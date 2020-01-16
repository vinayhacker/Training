class Employee
{
		private String name;
		private int empid;
		double salary;
		//public Employee(){} //constructors must be public
		public Employee(int empid, String ename, double salary)
		{
		this.empid=empid;
		this.ename=empname;
		this.salary=salary;
		}
		

		public void setEmpid(int empid) // these are setters
		{ 
		this.empid=empid;
		}
		public void setEmpid(String ename)
		{ 
		this.ename=ename;
		}
		public void setEmpsalary(double salary)
		{
		this.esalary=salary;
		}
		
		public int getEmpid() { return empid; } // these are getters
		public String getEmpname() { return ename; }
		public double getEsalary() { return esalary; }
}

	class Test
		{
		public static void main(String[] args)
			{
		
				
			Employee e =  new Employee(100,"ashok",10000)
			
			system.out.println(" Empid is"+e.getEmpid());
			system.out.pribntln("Ename is"+e.getEname());
			system.out.println("Esalary is"+e.getEsalary());
			}
		}
				
				
				
			//Employee e1 = new Employee(); //will be initialised with default, e1 is a reference viariable;
		
			//Employee e2 = new Employee(100,"ashok",10000) // here e2 constructor has some parameters

	
		}

}
