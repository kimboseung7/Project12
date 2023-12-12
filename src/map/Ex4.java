package map;

import java.util.HashMap;
import java.util.Iterator;

public class Ex4 {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member member1 = new Member(1001, "둘리"); //회원을제작
		Member member2 = new Member(1002, "또치");
		Member member3 = new Member(1003, "도우너");
		Member member4 = new Member(1004, "고길동");
		
		memberHashMap.addMember(member1); //add메소드로추가
		memberHashMap.addMember(member2);
		memberHashMap.addMember(member3);
		memberHashMap.addMember(member4);
		memberHashMap.showAllMember(); // 회원 출력
		
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
		
		

	}

}



class MemberHashMap {
	
	
	
	HashMap<Integer, Member> map; //map 선언
	
	//회원목록을 저장할 map
	public MemberHashMap() {
		map = new HashMap<>();
	}
	
	
	// 맵에 회원을 추가하는 메소드
	public void addMember(Member member) {
		map.put(member.memberId, member);
		
	}	
	
	public boolean removeMember(int memberId) {
		
		if(map.containsKey(memberId)) {//해당회원이 있으면
			map.remove(memberId);
			System.out.println(memberId+"번 회원을 삭제하였습니다");
			return true;
		}else {
			//해당회원이 없으면
			System.out.println(memberId + "번 회원이 존재합니다");
			return false;	
		}
		
	}
	
	void showAllMember() {
		Iterator<Integer> keys = map.keySet().iterator();
		while (keys.hasNext()) { // 
			Integer key = keys.next(); //
			System.out.println("[Key]:" + key + " [Value]:" + map.get(key)); 
		}
	}
}

