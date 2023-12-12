package collection.quiz;

import java.util.HashSet;
import java.util.Iterator;

public class Quiz4 {

	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<>();
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(3);
		
		Iterator<Integer> a = hashSet.iterator();
		while(a.hasNext()){
			Integer number = a.next();
			System.out.println(number + " ");
		}
		
		for(Integer number : hashSet) {
			System.out.println(number);
		}

	}

}
