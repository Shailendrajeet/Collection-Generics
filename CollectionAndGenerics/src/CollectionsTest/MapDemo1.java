package CollectionsTest;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo1 {
	public static void main(String[] args) {
		//Map<String, String> map = new Hashtable<String, String>();
		//Map<String, String> map = new HashMap<String, String>();
		//Map<String, String> map = new LinkedHashMap<String, String>();
		Map<String, String> map = new TreeMap<String, String>();
		
		map.put("India", "Delhi");
		map.put("Japan", "Tokyo");
		map.put("France", "Paris");
		map.put("Russia", "Moscow");
		map.put("Pakistan","Islamabad");
		map.put("Srilanka","Colombo");
		map.put("India", "Hyderabad");
		//map.put(null, null);
		System.out.println(map.toString());
		
		//Read keys
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()){
			String key = keys.next();
			System.out.print(key+"  ");
		}
		System.out.println();
		
		Iterator<String> values = map.values().iterator();
		while(values.hasNext()){
			String value = values.next();
			System.out.print(value+"  ");
		}

	}
}
