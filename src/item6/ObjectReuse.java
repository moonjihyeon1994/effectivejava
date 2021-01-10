package item6;

import java.util.regex.Pattern;

/**
 * String matches는 정규표현식으로 문자열 형태를 확인하는 가장 쉬운 방법이지만,
 * 성능이 중요한 상황에서 반복해 사용하기엔 적합하지 않다.
 */
public class ObjectReuse {

    static boolean isRomanNumeral(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

}

/**
 * Pattern 인스턴스를 클래스 초기화 과정에서 직접 생성해 캐싱해두고, 나중에 메서드가 호출될 때마다 재사용한다.
 * 성능 뿐만아니라 코드도 명확해진다.
 */
class RomanNumerals {
    private static final Pattern ROMAN = Pattern.compile(
            "^(?=.)M*(C[MD]|D?C{0,3})" + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    static boolean isisRomanNumeral(String s) {
        return ROMAN.matcher(s).matches();
    }
}
