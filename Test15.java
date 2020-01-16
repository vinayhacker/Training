import java.util.HashSet;
import java.util.Iterator;

class Test15
{
	public static void main(String[] args)
	{
		HashSet<String> hs1 = new HashSet<Employee>();
		hs1.add("empid"); 	//add is a boolean value. if successfully added, it shows true.
		hs1.add("name");
		hs1.add("salary");
		hs1.add("doj");
		
		for(String s : hs1)
		System.out.println(s);
	}
}