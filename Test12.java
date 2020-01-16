import java.util.HashSet;
import java.util.Iterator;
class Test12
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
		
		
		System.out.println("-----removing everything,change this place to see below output---------");
		hs.clear();
		
		for(String s : hs) //this means for string 's' IN hs
			System.out.println(s);
		
		
		System.out.println("-------removing an element(we'll know true or false)-----------");
		System.out.println(hs.remove("whatsup"));
		
		
		
		
		
		System.out.println("-------------the below is using iterations in another type-------------------------");
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext())
		System.out.println(itr.next());
		
		
		
	}
}