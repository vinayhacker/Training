import java.util.TreeMap;
import java.util.Set;
import java.util.collection;
import java.util.Map.Entry;

class Test1
{
	public static void main(String[] args)
	{
	TreeMap<String,String> map= new TreeMap<>();
	map.put("abc@gmail.com","abc@123");
	map.put("xyz@yahoo.com","xyz@123");
	map.put("bbc@bbc.com","bbc@123");
	map.put("someuser@mail.com","someuser@123");

	Set<Entry(String,String>> set = map.entrySet();
for(Entry<String,String> s: set)
	System.out.println(s.getKey()+""+s.getvalue());
	
	
	}
}