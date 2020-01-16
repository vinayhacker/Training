import java.util.HashSet;
import java.util.Iterator;

class Test15
{
	public static void main(String[] args)
	{
		HashSet<Employee> hs1 = new HashSet<Employeee	>();
		hs1.add(new Employee(101,"ashok",1000)); 	//add is a boolean value. if successfully added, it shows true.
		hs1.add(new Employee(102,"name2",2000));
		hs1.add(new Employee(103,"name3",1050));
		
		for(Employee e : hs)
		e.display();
		Iterator<Employee> itr = hs.iterator();
		while(itr.hasNext())
			itr.next().display();
	}
}