package item3;

/**
 * public static final 방식의 싱글턴
 * 클래스가 초기화 될 때 인스턴스가 한번만 만들어진다. 하지만 예외가 발생하면 두개가 생길수도있다.
 */
public class Elvis {
    public static final Elvis INSTANCE = new Elvis();

    private Elvis() {
    }

    public void leaveTheBuilding() {
    }
}

/**
 * 아래와 같은 public 필드 방식의 큰 장점은 해당 클래스가 싱글턴임을 명백히 들어난다.
 */
class ElvisByFactory {
    private static final ElvisByFactory INSTANCE = new ElvisByFactory();

    private ElvisByFactory() {
    }

    public static ElvisByFactory getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {
    }

    private Object readResolve() {
        return INSTANCE;
    }
}

/**
 * 열거 타입 방식의 싱글턴
 */
enum ElvisByEnum {
    INSTANCE;

    public void leaveTheBuilding() {
    }
}