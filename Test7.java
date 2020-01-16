class Student
{
		private int Rno;
		private String Name;
		private int s1;
		private int s2;
		private int s3;
		
	
		
		public Student(int Rno, String Name, int s1, int s2, int s3)
		{
		this.Rno=Rno;
		this.Name=Name;
		
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
		
		}
		
		public int getRno() { return Rno; }
		public String getName() { return Name; }
		public int getTotalmarks() { return s1+s2+s3; }
		public int getAverage() { return (s1+s2+s3)/3; }
		public String getResults()
		{
			if(s1>=40 && s2>=40 && s3>=40)
				return "passed";
				return "failed";
		}
		
		
		
		public String getDivision() 
		{
			if(s1>=40 && s2>=40 && s3>=40)

			return "passed";
			return "failed";
		}
		

		
}



class Test7
{
	public static void main(String[] args)
	{
	Student s[] ={new Student(100,"ashok",50,60,170),new Student(101,"ashok11",10,60,70),new Student(1,"ashok1",50,61,70)};
	
	for(int i=0;i<3;i++)
	{
	System.out.println(s[i].getRno());
	System.out.println(s[i].getName());
	System.out.println(s[i].getTotalmarks());
	System.out.println(s[i].getAverage());
	System.out.println(s[i].getResults());
	System.out.println(s[i].getDivision());
	}
	}
}
	