package collection.quiz;
// 리스트 인터페이스
import java.util.ArrayList;

public class Quiz1 {

	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<Character>();
		
		Character list1 = 'A'; //오토박싱을 사용하여 생성자 사용 할 필요가 없음
		Character list2 = 'B';
		Character list3 = 'C';
		list.add(list1);
		list.add(list2);
		list.add(list3);
		//그냥 바로 대입해도됨 list.add(B);
		
		for(int i = 0; i<list.size(); i++) {
			Character character = list.get(i);
			System.out.println(character.toString()); //하나씩 출력
		}
		
		list.remove(1); //리스트 요소 삭제
		
		System.out.println("2번째 요소 삭제: " + list);
		System.out.println("리스트 크기: " + list.size());
	}

}
class List {
	String Str;

	public List(String str) {
		super();
		Str = str;
	}

	@Override
	public String toString() {
		return "List [Str=" + Str + "]";
	}
}