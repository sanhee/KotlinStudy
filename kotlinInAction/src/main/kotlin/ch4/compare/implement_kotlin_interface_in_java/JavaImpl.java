package ch4.compare.implement_kotlin_interface_in_java;


/*
    자바에서 코틀린의 메소드가 있는 인터페이스 구현

    - 코틀린은 자바 6과 호환된게 설계됨
    - 인터페이스의 디폴트 메서드를 지원하지 않음
      - 정적 메소드로 들어있는 클래스를 조합해서 생성해냄

    - 만약, 디폴트 인터페이스가 포함된 코틀린 인터페이스를 자바 클래스에서 상속하고 싶다면?
      - 자바에서는 코틀린의 디폴트 메소드 구현에 의존할 수 없음.
      - 따라서, 코틀린에서 메소드 본문을 제공하는 메소드를 포함하는 모든 메소드에 대한 본문을 작성 해야함
 */

public class JavaImpl implements KotlinInterface {
    public void abstractMethod() {
        System.out.println("추상메서드 구현");
    }

    @Override
    public void defaultMethod() {
        System.out.println("디폴트 메서드 본문 다시 구현해야함 ㅠㅠ");
    }
}
