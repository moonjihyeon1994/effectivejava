## try-finally 보다는 try-with-resources 를 사용하라

<br>

### 꼭 회수해야 하는 자원을 다룰 때는 try-finally 말고, try-with-resources 를 사용하자. 예외는 없다. 코드는 더 짧고 분명해지고, 만들어지는 예외 정보도 훨씬 유용하다.