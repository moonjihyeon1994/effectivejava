package item4;

/**
 * Assertion 에러를 사용하여 실수로라도 생성자를 호출하지 않도록 해준다.
 * 상속도 불가능하게 해주는 효과도 있다.
 */
public class UtilityClass {
    // 기본 생성자가 만들어지는 것을 막는다(인스턴스화 방지용)
    private UtilityClass() {
        throw new AssertionError();
    }
}
