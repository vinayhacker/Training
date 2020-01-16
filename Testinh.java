class Cls1
{
public int id;
public String name;
public int rank;


	public Cls1(int id, String name, int rank)
	{
		this.id=id;
		this.name=name;
		this.rank=rank;
	}
}

class Cls2 extends Cls1
{
	public int secondid;
	public int secondrank;
	
		public Cls2(int id, String name, int rank, int secondid, int secondrank)
		{
		super(id,name,rank); //added 1st cls values
		this.secondid=secondid;
		this.secondrank=secondrank;
		}
		
		public int sum()
		{
			return id+secondid;
		}
		


}

class Testinh
{

	public static void main(String[] args)
	{
	
	Cls2 nc = new Cls2(11,"ashok",11,22,22);
	System.out.println(nc.secondid);
	System.out.println(nc.sum());
	
	
	}



}


