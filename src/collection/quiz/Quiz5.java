package collection.quiz;

import java.util.ArrayList;

public class Quiz5 {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		Member member1 = new Member(1001, "둘리");
		Member member2 = new Member(1002, "또치");
		Member member3 = new Member(1003, "도우너");
		Member member4 = new Member(1004, "고길동");
		
		//회원 4명 추가
		memberArrayList.addMember(member1);
		memberArrayList.addMember(member2);
		memberArrayList.addMember(member3);
		memberArrayList.addMember(member4);
		memberArrayList.showAllMember();
		
		// 아이디로 4번째 회원 삭제
		memberArrayList.removeMember(1004);
		memberArrayList.showAllMember();
		

	}
}


class Member{
	int memberId;
	String name;
	public Member(int memberId, String name) {
		super();
		this.memberId = memberId;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", name=" + name + "]";
	}
	
	
	
	
}

class MemberArrayList{
	ArrayList<Member> list; // 리스트 선언
	
	public MemberArrayList() {
		list = new ArrayList<Member>(); //리스트를 생성해줘야지 사용가능	
		
		
	}
	void addMember(Member member) { //리스트에 회원을 추가하는 메소드
		list.add(member);
	}
	boolean removeMember(int memberId) {
		
		//리스트를 순회하면서 특정회원 아이디를 가지는 회원 찾기
		//실현가능한데 까지 쪼개주면서 반환
		for(int i = 0; i<list.size(); i++) {
			Member member = list.get(i); 
			int id = member.memberId;
			// 해당 회원의 아이디가 인자가 같은지 비교
			if(memberId == id){
				list.remove(i); // 같으면 삭제
				System.out.println(memberId);
				return true; //삭제에 성공했으면 true 변환
			}
			
		}
		return false;
		
		//리스트를 순회하면서 특정회원 아이디를 가지는 회원 찾기
		//해당 회원의 아이디가 인자가 같은지 비교
		//같으면 삭제
		
		
		
		
	}
	void showAllMember() {
		for(int i =0; i<list.size(); i++) {
			Member member = list.get(i);
			System.out.println(member);
		}
		System.out.println();
	}
	
}