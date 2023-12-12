package generic;

//첫번째 재료인 Powder 클래스 정의하기
class Powder {

	public void doPrinting() {
		System.out.println("Powder 재료로 출력합니다");

	}

	public String toString() {
		return "자료는 Powder 입니다";
	}

}

//두번째 재료인 Plastic 클래스 정의하기
class Plastic {

	public void doPrinting() {
		System.out.println("Plastic 재료로 출력합니다");
	}

	public String toString() {
		return "자료는 Plastic 입니다";
	}

}

//파우더를 재료로 모형을 출력하는 프린터 정의하기
class ThreeDPrinter1 {

	// 재료가 파우더인 경우
	private Powder material;// 재료 변수의 자료형을 Powder로 선언

	public void setMaterial(Powder powder) {
		this.material = powder;
	}

	public Powder getMaterial() { // 안에 가지고 있는 데이터를 꺼내줌
		return material;
	}

}

//플라스틱을 재료로 모형을 출력하는 프린터 정의하기
class ThreeDPrinter2 {

	private Plastic material;//변수의 자료형을 Plastic으로 선언

	public void setMaterial(Plastic material) {
		this.material = material;
	}

	public Plastic getMaterial() {
		return material;
	}
}