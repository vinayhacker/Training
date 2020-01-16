class Cls1
{
	public int id;
	public int age;
	
public Cls1(int id, int age)
	{
	this.id=id;
	this.age=age;

	}
}

class Cls2 extends Cls1
{

	public int id2;
	public int age2;
	
public Cls2(int id, int age, int id2, int age2)
	{
super(id,age);
this.id2=id2;
this.age2=age2;
	}
public double sum()
{ 

return id+id2+age+age2;}

public void check()
{ 
	if(sum()==6) 
	{
	System.out.println("dj gundu vinay");
	}
}
	
	

 



}


class Inh
{

public static void main(String[] args)
{
Cls2 nc = new Cls2(1,2,1,2);
System.out.println(nc.sum());
nc.check();
}
}