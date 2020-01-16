import java.util.TreeSet;
import java.util.Iterator;
class Tree1
{
	public static void main(String[] args)
	{
	TreeSet<String> tset = new TreeSet<>();
	tset.add("some value one");
	tset.add("two");
	tset.add("three");
	tset.add("four");
	
	
for(String s : tset)
	System.out.println(s);


	}

}