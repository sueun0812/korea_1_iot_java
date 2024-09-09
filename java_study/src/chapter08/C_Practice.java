package chapter08;

// === 다형성 ===
// Animal, Cat, Dog 클래스 선언

// Animal 클래스 : sound 메서드 (The animal makes a sound)

// Cat, Dog 클래스 - Animal 클래스를 상속
// : sound 메서드를 오버라이딩 >> 각각 "meow", "brak" 출력
class Animal {
	void sound() {
		System.out.println("The animal makes a sound");
	}
}

class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("Meow");
	}
}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("Bark");
	}
}

// === instanceof 연산자 ===
// AnimalChecker 클래스 선언
// : Animal, Cat, Dog 클래스를 사용하여 다형성을 확인하는 메서드 작성
// : checkAnimalType 메서드 - Animal 타입의 매개변수를 전달
// : instanceof 연산자를 사용하여 매개변수가 Cat과 Dog 중 어느 인스턴스인지 확인
// : Cat > 'cat'출력 / Dog > 'dog' 출력 / 둘 다 X > 'Unknown animal type'

class AnimalChecker {
	void checkAnimalType(Animal animal) {
		if (animal instanceof Cat) {
			System.out.println("Cat");
		} else if (animal instanceof Dog) {
			System.out.println("Dog");
		} else {
			System.out.println("Unknown animal type");
		}
	}
}

public class C_Practice {

	public static void main(String[] args) {
		// Animal, Cat, Dog 클래스의 객체를 Animal 타입으로 저장
		AnimalChecker animalChecker = new AnimalChecker();
		
		Animal myPet1 = new Animal();
		animalChecker.checkAnimalType(myPet1);	// Unknown animal type
		
		// 강제 형 변환의 경우
		// >> 자동 형 변환으로 상속받은 클래스 형태를 다시
		//		인스턴스의 타입으로 변환 할 경우에 사용
//		Dog myPetDog = (Dog) myPet1;	- Error
//		animalChecker.checkAnimalType(myPetDog);
		
		Animal myPet2 = new Cat();
		animalChecker.checkAnimalType(myPet2);		// Cat
		
		Animal myPet3 = new Dog();
		animalChecker.checkAnimalType(myPet3);		// Dog
		

	}

}
