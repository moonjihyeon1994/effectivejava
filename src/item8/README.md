## finalizer와 cleaner 사용을 피하라

<br>

### 자바에서 메모리 관리에 싱경 쓰지 않아도 된다고 오해할 수 있는데, 절대 사실이 아니다.
##### 대표적으로 stack, 캐시, 리스터 혹은 콜백이다. 메모리 누수가 발생하지 않도록 잘 고려해야한다.
