package map;

import java.util.HashMap;
import java.util.Set;

public class Ex3 {

	public static void main(String[] args) {
		// 회원목록을 저장하는 map 생성
		HashMap<Integer, Member> map = new HashMap<>();
		
		//회원 추가
		//옵션1
		Member member1 = new Member(1001, "둘리");
		Member member2 = new Member(1002, "둘삼");
		Member member3 = new Member(1003, "둘사");
		//옵션2
		map.put(member1.memberId, member1);
		map.put(member2.memberId, member2);
		map.put(member3.memberId, member3);
		
		//회원 조회
		System.out.println(map.get(1001));
		System.out.println(map.get(1002));
		System.out.println(map.get(1003));
		
		// 1번째 회원 삭제
		map.remove(1001);
		
		// 전체 회원 수 출력
		System.out.println("전체 회원 수:" + map.size());
		
		// 전체 회원 목록 출력
		System.out.println(map);
		
		// 회원 목록 순회하기
		Set<Integer> keyset = map.keySet();
		
		for(int key : keyset) {
			System.out.println("[key]:" + key + "[Value]" + map.get(keyset));
		}
	}

}

//쇼핑물 회원 클래스 만들기
class Member{
	
	int memberId; // 회원 아이디
	String memberName; //회원이름
	public Member(int memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
	}
}
