import java.util.HashSet;
import java.util.Iterator;
class Test11
{
	public static void main(String[] args)
	{
		HashSet<String> hs = new HashSet<String>();
		hs.add("hi bro"); 	//add is a boolean value. if successfully added, it shows true.
		hs.add("whatsup");
		hs.add("its hi 2");
		hs.add("added into hs");
		System.out.println(hs.add("ELEMENT ADDED OE NOT WE CAN KNOW BY THIS"));
		System.out.println(hs.size());
		
		for(String s : hs) //this means for string 's' IN hs
			System.out.println(s);
		
		System.out.println("-------------the below is using iterations in another type-------------------------");
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext())
		System.out.println(itr.next());
		
		
	}
}