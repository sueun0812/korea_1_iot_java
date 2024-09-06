package chapter07;

// final 키워드
// : 변수, 메서드, 클래스에서의 사용법

class MyFinalClass {
	// 1. final 변수
	// : 상수를 지정하는 키워드
	// >> 재할당 불가능, 선언과 동시에 초기화
	// >> 변수명을 모두 대문자로 작성, 단어와 단어의 연결을 _기호로 연결
	final int FINAL_VALIABLE = 30;
//	FINAL_VALIABLE = 10; - Error (재할당 불가)
	
	// 2. final 메서드
	// : 자식 클래스에서 오버라이드 할 수 없는 메서드를 의미
	// (접근제한자) final 반환타입 메서드명() {}
	public final void myMthod() {
		System.out.println("재정의 할 수 없는 메서드");
	}
}

// 3. final 클래스
// final class 클래스명
// : 더 이상 상속될 수 없는 클래스를 의미
// >> final 클래스를 부모 클래스로 사용할 수 없음

final class ChildClass extends MyFinalClass {
//	@Override
//	public void myMethod() {
//		
//	}
	// : 상속받은 final 메서드는 자식 클래스에서 재정의되지 않고
	// >> 생략된 형태만으로 사용 가능
}

//class GrandSon extends ChildClass {	
//	- Error(final 클래스를 상속받지 못함)
//}

public class D_Final {

	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		cc.myMthod();	// 재정의 할 수 없는 메서드
		
		// cf) 하이픈 VS 언더스코
//		choco-cake		// 더블 클릭 시 단어 각각이 선택 됨
//		choco_cake		// 더블 클릭 시 모든 단어가 선택 됨
		
		
		// final 장단점
		
		// - 장점
		// : 불변성
		// >> 안정성 보장
		
		// - 단점
		// : 유연성 감소
		// >> 상속 불가, 오버라이딩 불가 : 그 자체로만 사용 가능

	}

}
