package map.quiz;

import java.util.HashMap;
import java.util.Set;

public class Qz4 {

	public static void main(String[] args) {
		HashMap<Integer, Student> map = new HashMap<>();

		map.put(1001, new Student(1001, "둘리", 90, 80, 70));
		map.put(1002, new Student(1002, "도우너", 55, 65, 75));
		map.put(1003, new Student(1003, "또치", 80, 50, 50));

		Set<Integer> set = map.keySet();
		for (int key : set) {
			Student student = map.get(key);
			int sum = student.kor + student.math + student.eng;
			double avg = sum / 3;
			System.out.println(student.name + " 총점:" + sum + " 평균:" + avg);
		}
		int sKor = 0;
		int sMath = 0;
		int sEng = 0;
		Set<Integer> set1 = map.keySet();
		for (int key : set1) {
			Student student = map.get(key);
			sKor += student.kor;
			sMath += student.math;
			sEng += student.eng;
		}
		System.out.println("국어 합계" + sKor + "평균" + (sKor/3));
		System.out.println("수학 합계" + sMath + "평균" + (sMath/3));
		System.out.println("영어 합계" + sEng + "평균" + (sEng/3) );
	}

}

class Student {
	int no;
	String name;
	int kor;
	int math;
	int eng;

	public Student(int no, String name, int kor, int math, int eng) {
		super();
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", kor=" + kor + ", math=" + math + ", eng=" + eng + "]";
	}

}