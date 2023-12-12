package generic;

public class Ex2 {

	public static void main(String[] args) {
			
		ThreeDprinter3 printer = new ThreeDprinter3();
		
		Powder p1 = new Powder(); //Powder을 재료로 선택
		
		printer.setMaterial(p1); //부모타입 변수 = 자식 인스턴스
		
		Object material = new Powder();
		
		Powder p2 = (Powder) printer.getMaterial(); //재료를 꺼낼 때는 직접 다운캐스팅을 해줘야됨 ex) (Powder)
		
		p2.doPrinting();
		
	}

}

//파우더와 플라스틱을 재료로 사용하는 프린터 만들기
class ThreeDprinter3{
	
	private Object material;//변수의 자료형을 Object로 선언하면 파우더와 플라스틱을 사용하는 프린터 사용가능

	public void setMaterial(Object material) { //
		this.material = material;
	}

	public Object getMaterial() { //Object로 변환
		return material;
	}
	
}