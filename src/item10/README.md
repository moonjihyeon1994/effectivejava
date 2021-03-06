## equals는 일반 규약을 지켜 재정의하라

<br>

### 재정의하지 않는 경우
#### 각 인스턴스가 본질적으로 고유하다.
#### 인스턴스의 '논리적 동치성'을 검사할 일이 없다.
#### 상위 클래스에서 재정의한 equals가 하위 클래스에도 딱 들어맞는다.
#### 클래스가 private이거나 package-private이고 equals 메서드를 호출할 일이 없다.

<br>

### 재정의해야 할 경우
#### 객체 식별성이 아니라 논리적 동치성을 확인해야 하는데, 상위 클래스의 equals가 논리적 동치성을 비교하도록 재정의되지 않았을 때다.
#### 값 클래스라 해도, 값이 같은 인스턴스가 둘 이상 만들어지지 않음을 보장하는 인스턴스 통제 클래스라면 재정의하지 않아도 된다.

<br>

### equals 메서드는 동치관계를 구현하며, 다음을 만족한다.
#### 반사성 : null이 아닌 모든 참조 값 x에 대해, x.equals(x) 는 true다.
#### 대칭성 : null이 아닌 모든 참조 값 x, y에 대해, x.equals(y)가 true면 y.equals(x)도 true다.
#### 추이성 : null이 아닌 모든 참조 값 x, y, z에 대해, x.equals(y)가 true면 y.equals(z)도 true면 x.equals(z) 도 true이다.
#### 일관성 : null이 아닌 모든 참조 값 x, y에 대해, x.equals(y)를 반복해서 호출하면 항상 true를 반환하거나 항상 false를 반환한다.
#### null-아님 : null이 아닌 모든 참조 값 x에 대해, x.equals(null)은 false다.

<br>

### equals 메서드 구현 방법
#### 1. == 연산자를 사용해 입력이 자기 자신의 참조인지 확인한다.
#### 2. instanceof 연산자로 입력이 올바른 타입인지 확인한다.
#### 3. 입력을 올바른 타입으로 형변환한다.
#### 4. 입력 객체와 자기 자신의 대응되는 '핵심' 필드들이 모두 일치하는지 하나씩 검사한다. float와 double을 제외한 기본 타입 필드는 == 연산자로 비교하고, 참조 타입 필드는 각각 equals 메서드로 비교한다.