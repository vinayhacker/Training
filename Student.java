class Student
{
	private int Sid;
	private String Sname;
	private double Salary;
	
	public Student(int Sid,String Sname,double Salary)
		{
		this.Sid=Sid;
		this.Sname=Sname;
		this.Salary=Salary;
		}
	public void setSid(int Sid)
	{
		this.Sid=Sid;
	}
	public void setSname(String Sname)
	{
		this.Sname=Sname;
	}
	public void setSalary(double Salary)
	{
		this.Salary=Salary;
	}	
	public  int getSid()
	{
		return Sid;
	}
	public  String  getSname()
	{
		return Sname;
	}
	public  double getSalary()
	{
		return Salary;
	}
	
}

class Tranining
{
	int Tidno;
	String Tname;
	Student std;
	
public void Training(int Tidno,String Tname,Student std)
	{
	this.Tidno=Tidno;
	this.Tname=Tname;
	this.std=std;
	
	}
  public void setTidno(int Tidno)
	{
	this.Tidno=Tidno;
	}
	public void setTname(String Tname)
	{
		this.Tname=Tname;
	}
	public  void setStudent(Student std)
	{
		this.std=std;
	}
	public  int getTidno()
	{
		return Tidno;
	}
	public  String getTname()
	{
		return Tname;
	}
 public Student getStudent()
	{
	return std;
	}
	
	
	
 }
 
class Exam
{
	public static void main(String[] args)
		{
			Student std1=new Student(1,"student one",100);
			Student std2=new Student(2,"student two",200);
			
		} 
}

