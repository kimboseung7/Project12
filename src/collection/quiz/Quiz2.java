package collection.quiz;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<Character>();
		
		Character list1 = 'A';
		Character list2 = 'B';
		Character list3 = 'C';
		
		list.add(list1);
		list.add(list2);
		list.add(list3);
		
		for (int i = 0; i<list.size(); i++)
		if(list.get(i).equals('A')) {
			list.remove(i);
		}
		System.out.println(list);
	}

}
