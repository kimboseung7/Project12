package map.quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Qz3 {

	public static void main(String[] args) {
		HashMap<String, Double> map = new HashMap<>();
		map.put("국어", 80.0);
		map.put("수학", 90.0);
		map.put("영어", 100.0);
		
		
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(key);
			System.out.println(map.get(key));
		}	
		Set<String> set = map.keySet();
		for(String key : set) {
			System.out.println(key);
			System.out.println(map.get(key));
		}
	
	}

}
