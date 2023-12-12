package generic;

public class Ex3 {

	public static void main(String[] args) {
		// 1.파우더를 사용하는 프린터기 생성

		// 객체를 생성할 때 타입을 파우더로 지정 //T파라미터에 Powder가 들어옴
		ThreeDPrinter<Powder> printer1 = new ThreeDPrinter<>();

		printer1.setMaterial(new Powder());

		Powder powder = printer1.getMaterial();

		powder.doPrinting();

		// 2.플라스틱을 사용하는 프린터기 생성
		// 객체를 생성할 때 타입을 플라스틱으로 지정 //T파라미터에 plastic이 들어옴
		ThreeDPrinter<Plastic> printer2 = new ThreeDPrinter<>();

		printer2.setMaterial(new Plastic());

		Plastic plastic = printer2.getMaterial();

		plastic.doPrinting();
	}

}

//제네릭 클래스 만들기
class ThreeDPrinter<T> { // 통상적으로 T나 E를 사용하고 있음 //이 문자 T가 위에서 플라스틱이나 파우더로 변함
	private T material; // Object대신 문자 T 작성

	public void setMaterial(T material) { // 매개변수
		this.material = material;
	}

	public T getMaterial() { // 리턴 타입 변경
		return material;
	}

}