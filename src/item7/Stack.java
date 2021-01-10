package item7;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        this.ensureCapacity();
        this.elements[this.size++] = e;
    }

    /**
     * 커졌다가 줄어들때 스택에서 꺼내진 객체들을 가비지 컬렉터가 회수 하지 않는다.
     */
    // 이전
    public Object pop() {
        if (this.size == 0) throw new EmptyStackException();
        return this.elements[--this.size];
    }

    // 이후
    public Object refactoring_pop() {
        if (this.size == 0) throw new EmptyStackException();
        Object result = this.elements[--this.size];
        this.elements[this.size] = null; // 다 쓴 참조 해제
        return this.elements[--this.size];
    }

    /**
     * 원소를 위한 공간을 적어도 하나 이상 확보한다.
     * 배열 크기를 늘려야 할 때마다 대략 두 배씩 늘린다.
     */
    private void ensureCapacity() {
        if (this.elements.length == size) this.elements = Arrays.copyOf(this.elements, 2 * this.size + 1);
    }
}
