class Student[]
{
		private int Rno;
		private string name;
		private int s1;
		private int s2;
		private int s3;
	
		
		public Student[]() {}
		public Student(int Rno, string name, double totalmarks, double average, double division, double results)
		{
		this.Rno=Rno;
		this.name=Name;
		this.totalmarks=Totalmarks;
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
		}
		
		public int getRno() { return Rno; }
		public string getName() { return name; }
		public int getTotalMarks() { return s1+s2+s3; }
		public int getAverage() { return (s1+s2+s3)/3; }
		public string getResults()
		{
			if(s1>=40 && s2>=40 && s3>=40)
				return "passed";
				return "failed";
		}
		
		
		
		public string getDivision() 
		{
			if(s1>=40 && s2>=40 && s3>=40)

			return "passed";
			return "failed";
		}
		

		
}



class Test
{
	public static void main(string[] args)
	{
	Student s[] ={ new Student(100,"ashok",50,60,170),new Student(101,"ashok11",10,60,70),new Student(1,"ashok1",50,61,70)};
	System.out.println(s.getRno());
	System.out.println(s.getName());
	System.out.println(s.getTotalMarks());
	System.out.println(s.getAverage());
	System.out.println(s.getResults());
	System.out.println(s.getDivision());
	}
}
	