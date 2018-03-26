import java.util.HashMap;

public class Repository {
	private HashMap<String, Integer> map;

	public HashMap<String, Integer> getMap() {
		return map;
	}
	//Constructor
	public Repository() {
		map = new HashMap<String, Integer>();
	}
	
	public void setWord(String options) {
		String s= options;
		if (!map.containsKey(s)) {
			map.put(s, 1);
		} else {
			map.put(s, map.get(s) + 1);
		}
	}
	
	public void printMap(String options) {
		System.out.print("======================================");
		/*
		Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
		for (; it.hasNext();) {
			Map.Entry<String, Integer> pair = (Map.Entry<String, Integer>) it.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());
		}
		*/
		for(String key : map.keySet()) {
			int v = map.get(key);
			System.out.format("\nkey=%s value= %d", key, v);
		}
		System.out.println();
		System.out.println("======================================");
	}
	
	public void save() {
		System.out.println("======================================");
		System.out.println("Save File is Unimplemended");
		System.out.println("======================================");
	}
	
	public void load() {
		System.out.println("======================================");
		System.out.println("Load File is Unimplemended");
		System.out.println("======================================");
	}
}
