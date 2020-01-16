import java.util.HashSet;
import java.util.Iterator;
class Test14
{
	public static void main(String[] args)
	{
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("hi bro"); 	//add is a boolean value. if successfully added, it shows true.
		hs1.add("whatsup");
		hs1.add("its hi 2");
		hs1.add("added into hs");
		
		
		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("dj gv");
		hs2.add("whatsup");
		hs1.retainAll(hs2);
		
		for(String s : hs1)
		System.out.println(s);
		
		
	}
}