## 인스턴스화를 막으려거든 private 생성자를 사용하라

<br>

#### 단순히 정적 메서드와 정적 필드만을 담은 클래스를 만들고 싶을 때가 있다.
#### java.util.Arrays처럼 기본 타입 값이나 배열 관련 메서드들을 모아놓을 수 있다. 또한 java.util.Collections처럼 특정 인터페이스를 구현하는 객체를 생성해주는 정정 메서드를 모아놓을 수도 있다. 마지막으로는 final 클래스와 관련한 메서드들을 모아놓을 때도 사용한다.
#### 인스턴스를 만들어 사용하려고 설계한 게 아니지만 생성자를 명시하지 않으면 컴파일러가 자동으로 기본 생성자를 만들어준다.
#### private 생성자를 추가하면 클래스의 인스턴스화를 막을수 있다. 
