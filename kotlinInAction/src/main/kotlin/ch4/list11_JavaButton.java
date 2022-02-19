package ch4;

import org.jetbrains.annotations.NotNull;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Base64;

/*
    [교재에 직렬화 하는 부분에 대한 코드가 적혀있지 않아, 내가 추가 구현한 예제]

    ButtonState를 직렬화 하면 아래의 예외가 발생한다.
    -> Exception in thread "main" java.io.NotSerializableException: ch4.list11_JavaButton

    직렬화하려는 변수는 objectOutputStream.writeObject(button.getCurrentState());
    즉, ButtonState 타입의 state 인데 왜 직렬화가 안될까?

    자바에서 다른 클래스 안에 정의한 클래스는 자동으로 inner class가 된다.
    따라서, ButtonState 클래스는 바깥쪽 list11_JavaButton 클래스에 대한 참조를 묵시적으로 포함
    -> 그 참조로 인해 ButtonState를 직렬화 할 수 없다.


    원인:
        - inner class 로 인해 ButtonState <-> list11_JavaButton 참조가 생겼다.
        - list11_JavaButton은 Serializable을 구현하지 않아 직렬화할 수 없다.

    해결:
        - inner class -> static class로 선언해 list11_JavaButton의 참조를 없애야 한다.
 */

public class list11_JavaButton implements View{
    @NotNull
    @Override
    public State getCurrentState() {
        return new ButtonState();
    }

    @Override
    public void restoreState(@NotNull State state) { /*....*/}

    public class ButtonState implements State{ /* ... */ }

    static class Serialize{
        public static void main(String[] args) throws IOException {
            list11_JavaButton button = new list11_JavaButton();

            byte[] serializeState;

            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);

            objectOutputStream.writeObject(button.getCurrentState());
            serializeState = out.toByteArray();

            System.out.println("직렬화 결과: " + serializeState);
            System.out.println("직렬화 결과(인코딩): " + Base64.getEncoder().encodeToString(serializeState));
        }
    }
}
