package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hashSet = new HashSet<>();
		
		hashSet.add("둘리"); //회원 추가
		hashSet.add("또치");
		hashSet.add("도우너");
		hashSet.add("도우너"); // 중복된 값은 추가 불가
		
		System.out.println("set 목록: " + hashSet);
		System.out.println("크기: " + hashSet.size());
		
		hashSet.remove("도우너");
		
		System.out.println("set 목록: " + hashSet);
		
		//Iterator클래스 꺼내기
		
		Iterator<String> ir = hashSet.iterator();
		
		while(ir.hasNext()){ ///다음 요소가 있으면
			String member = ir.next();
			System.out.println(member + " ");
		}
		for(String member : hashSet) {
			System.out.println(member + " ");
		}
	}

}
