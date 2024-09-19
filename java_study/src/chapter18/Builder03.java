package chapter18;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter

class Person {
	// 선택적 필드
	private String name;
	private int age;
	private String hobby;
	private String favoriteFood;
	
	// === @Builder 어노테이션 ===
	// Person 클래스의 내부 Builder 클래스
	// >> name, age, hobby, favoriteFood에 대한
	// 	선택적 필드 메서드
	
	// >> Person을 생성 해주는 build 메서드
	
	// === @Getter 어노테이션 ===
	// 필드 값에 대해 모두 getter 메서드를 생성
}

public class Builder03 {
	public static void main(String[] args) {
		Person ps1 = Person.builder()
				.name("정수은")
				.build();
		Person ps2 = Person.builder()
				.hobby("줄넘기")
				.build();
		Person ps3 = Person.builder()
				.favoriteFood("육회")
				.build();

		System.out.println(ps1.getName());		// 정수은
		System.out.println(ps2.getHobby());		// 줄넘기
		System.out.println(ps3.getFavoriteFood());		// 육회
		
	}
}
