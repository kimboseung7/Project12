package collection;

import java.util.ArrayList;

public class Ex2 {

	public static void main(String[] args) {
		
		ArrayList<Member> list = new ArrayList<>();
		
		Member member1 = new Member(1001, "둘리");
		Member member2 = new Member(1002, "또치");
		Member member3 = new Member(1003, "도우너");
		
		list.add(member1); //회원 추가
		list.add(member2);
		list.add(member3);
		list.add(member3); //같은 회원 중복 추가
		
		list.remove(0); //1번째 회원 삭제
		
		System.out.println("전체 회원 수: " + list.size());

		System.out.println(list);
		
		for (int i = 0; i< list.size(); i++) {
			
			Member member = list.get(i);
			System.out.println(member.toString()); //하나씩 출력
		}
	}

}
class Member {
	int memberId; //회원 아이디
	String memeberName; //회원 이름
	
	public Member(int memberId, String memeberName) {
		super();
		this.memberId = memberId;
		this.memeberName = memeberName;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memeberName=" + memeberName + "]";
	}
	
	
}
