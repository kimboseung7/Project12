package map.quiz;

import java.util.HashMap;

public class Qz1 {
//String형 키, int형 value를 가지는 HashMap객체 생성
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("국어", 80);
		map.put("수학", 90);
		map.put("영어", 100);
		
		System.out.println(map.get("국어"));
		System.out.println(map.get("수학"));
		System.out.println(map.get("영어"));
		
		System.out.println(map.size()); 
	}

}
