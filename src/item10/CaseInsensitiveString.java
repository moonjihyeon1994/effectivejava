package item10;

import java.util.Objects;

/**
 * 잘못된 코드 - 대칭성 위배
 */
public class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = Objects.requireNonNull(s);
    }

    // 대칭성 위배!
    /*
    @Override
    public boolean equals(Object o) {
        if (o instanceof CaseInsensitiveString)
            return this.s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
        if (o instanceof String) // 한 방향으로만 작동한다!
            return this.s.equalsIgnoreCase((String) o);
        return false;
    }
     */
    @Override
    public boolean equals(Object o) {
        return o instanceof CaseInsensitiveString && ((CaseInsensitiveString) o).s.equalsIgnoreCase(s);
    }
}
