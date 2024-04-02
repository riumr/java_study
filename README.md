# java_study

### 240305
<details>
<summary>Java 실행환경 구성</summary>

설치
- java 17
- OpenJdk : oracle adoptium
  - java가 설치되는 폴더에 설치
- 환경변수 등록 : jdk가 설치된 폴더로

intellij 설정
- setting에서 auto import 버튼 다 누르기
- setting-compiler에서 Build project automatically 체크
- intent-java. tap 크기를 2,2,4로 변경
- 로그 출력시 한글 깨짐 방지
  - Help-Edit custom VM options. -Dfile.encoding=UTF-8 추가하고 저장
- file-invalid Cahses. 제대로 import 되지 않거나 변경사항이 적용되지 않을 때
</details>

<details>
<summary>Java 변수 Type의 종류와 성질</summary>

- Type 크기에 맞는 literal을 넣어줘야 한다
- literal의 크기가 더 큰 경우에는 형변환을 해야 오류가 발생하지 않는다.

</details>

### 240306

<details>
<summary>변수 type 변환</summary>

```
char를 String으로 변환
String s2 = '3' + "";

String을 char로 변환
char c4 = s2.charAt(0);
```
</details>

<details>
<summary>증감, 산술, 비교, 논리, 삼항 연산자</summary>

```
조건연산 (삼항연산)
boolean b4 = (1 != 1) ? true : false;
```
</details>

<details>
<summary>키보드 입력값 받기</summary>

```
Scanner in = new Scanner(System.in);
```
</details>

<details>
<summary>반복문, 조건문</summary>

```

```
</details>

### 240307

<details>
<summary>switch 조건문</summary>

```
switch (조건) {
  case 결과 -> {
  ...
} default -> {
  ...
}

개선된 조건문
kind = switch (animal){
  case "호랑이" -> "포유류";
  case "참새" -> "조류";
  case "고등어" -> "어류";
  default -> {
    System.out.print("어이쿠, ");
        yield "...";
}
```
</details>

<details>
<summary>메소드의 선언과 호출, 값 반환</summary>

```
메소드는 매개변수를 필요로 한다
```
</details>

<details>
<summary>메소드 오버로딩, 참조</summary>

```
같은 이름의 메서드의 매개변수의 개수와 type을 다르게 한다.
```
</details>

<details>
<summary>class 이해. instance 생성 및 조작</summary>

```java
// 객체 속성 및 메서드 설정
public class Animal {
  // 필드
  int legs;
  // 메서드
  void eat(){
    System.out.println("먹는다.");
  }
  void move(){
    System.out.println("움직인다.");
  }
}

// 상속 : extends
public class Bird extends Animal {
  @Override
  void move() {
    System.out.println("난다");;
  }

  @Override
  void eat() {
    System.out.println("벌레를 먹는다.");
  }

  // 필드
  int legs = 2;
  int wings = 2;
  
}

// 캡슐화(은닉) : private




// 다형성 : @override (annotation)

```

</details>

### 240308

<details>
<summary>class의 구성요소</summary>

```

```
</details>

<details>
<summary> instance 변수와 static 변수와 비교</summary>

```
인스턴스 변수는 heap 영역에 저장되며, garbage collection의 대상이 된다.
```
</details>

<details>
<summary>접근자, 설정자</summary>

```
`private` 으로 캡슐화된 변수를 외부에서 사용할 때는 값을 
반환하는 접근자(getter)와 값을 변경하도록 하는 설정자(setter)가 필요하다
```
</details>

<details>
<summary>this를 통한 자기참조</summary>

```
```

</details>

### 240311

<details>
<summary>singleton 객체 : 중요</summary>

```

```
</details>

<details>
<summary>배열(Array)</summary>

```

```
</details>

<details>
<summary>String 메서드</summary>

```

```
</details>

### 240312

<details>
<summary>객체로 구성된 배열</summary>

```

```

</details>

<details>
<summary>가변개수 매개변수</summary>

```

```

</details>

### 240313

<details>
<summary>객체 상속</summary>

```

```
</details>

<details>
<summary>다형성</summary>

```
부모 생성자를 매겨변수로 가지는 메서드에서 사용될 수 있다
```
</details>


### 240314

<details>
<summary>upcasting 된 객체 배열에 담기</summary>

```

```
</details>

<details>
<summary>Instanceof 연산자 활용. Type 검증</summary>

```

```
</details>

<details>
<summary>부모 객체형으로 upcasting 된 자식요소만 downcasting 가능</summary>

```

```
</details>

<details>
<summary>Interface 기본</summary>

```
interface의 추상 메소드를 override 해야한다.
```
</details>

### 240315

<details>
<summary>추상 클래스</summary>

```

```
</details>

<details>
<summary>인터페이스로 upcasting</summary>

```

```
</details>

### 240318

<details>
<summary>Java.lang 패키지</summary>

`Object 클래스`

`Class`

`System`

`StringBuilder`

`Wrapper 포장클래스`
```markdown
Integer, String, Double 등이 있으며, 기초 변수 타입과 동일한 기능을 해준다.
이를 사용해 단순한 변수 타입의 객체도 Java 기본 패키지를 사용할 수 있다.
```

`Calendar`

`Arrays`

`Random`

`MessageFormat`

`StringTokenizer`

</details>

<details>
<summary>Generic 타입 객체 ArrayList<></summary>

</details>

<details>
<summary>Garbage collector 수동 호출</summary>

</details>

### 240319

<details>
<summary>예외처리</summary>

</details>

<details>
<summary>Generic type 클래스</summary>

</details>

<details>
<summary>함수형 interface 사용</summary>

</details>

<details>
<summary>참조</summary>

</details>

### 240320

<details>
<summary>LinkedList 클래스</summary>

</details>

<details>
<summary>List collection</summary>

</details>

<details>
<summary>Set collection</summary>

</details>

<details>
<summary>Stack 클래스</summary>

</details>

<details>
<summary>queue 컬렉션</summary>

</details>

<details>
<summary>Map 인터페이스</summary>

</details>

<details>
<summary>HashMap 클래스</summary>

</details>

<details>
<summary>Collections 클래스 정적 메소드</summary>

</details>

### 240321

<details>
<summary>Stream</summary>

Stream<T> = Stream.of(배열)

느긋한 연산. 요소를 요구하기 전까지 작업하지 않는다
</details>

<details>
<summary>Stream과 collections 사용 방식 비교</summary>

</details>

<details>
<summary>Stream 정렬</summary>

</details>

<details>
<summary>Stream 매핑</summary>

</details>

<details>
<summary>Stream 매칭과 검색</summary>

</details>

<details>
<summary>Stream 단순집계</summary>

</details>

<details>
<summary>Stream filtering, Collector</summary>

</details>

<details>
<summary>Stream Grouping, partitioning</summary>

</details>

<details>
<summary>Optional 타입</summary>

</details>

<details>
<summary>Array 직접 구현하기</summary>

- 배열의 원리 : overflow가 발생하면 배열의 크기를 2배 증가시킨다.
- 배열이 1/4 남아있다면 크기를 1/2로 줄인다.
</details>

### 240322

<details>
<summary>단순 연결 리스트 구현</summary>

- 노드로 구성됐다. 빈 공간이 존재하지 않음
- 자료 추가 삭제 : O(1). 자료 탐색 : O(N)

</details>

<details>
<summary>Queue 구현</summary>

- 자료 추가, 삭제 : O(1)

</details>

<details>
<summary>Stack 구현</summary>

- top에 넣고, top에서 제거한다.

</details>

### 240325

<details>
<summary>read(), write() 메소드로 입력 및 출력</summary>

- 

</details>

<details>
<summary>FileStream 클래스. 모든 파일을 읽고 쓸 수 있음</summary>

</details>

<details>
<summary>Thread 상속</summary>

</details>

<details>
<summary>Socket 클래스로 Client, server 구현</summary>

</details>

<details>
<summary>jdbc로 Mysql DB에 연결</summary>

**과정 순서**
- 
- 
- 
- 
- 
- 
- 


```java
Class.forName("com.mysql.cj.jdbc.Driver");
connect = DriverManager.getConnection(url, "root", "password");
```

</details>

<details>
<summary>Mysql DB에 값 추가(insert into)</summary>

</details>

<details>
<summary>Mysql DB 가져오기(select)</summary>

- 

</details>

### 240326

<details>
<summary>DAO 작성</summary>

**음식 결제 서비스**
- payments, restaurants, students 테이블 

**진행순서**
- DB 작성
- jdbc-db 연결
- java 객체생성
- DAO 작성
- 유저 인터페이스 작성

</details>

### 240327

<details>
<summary>요구 사항 도출 시</summary>

- 관련 분야의 비즈니스 로직에 대한 이해가 중요하다
- 관련 문서를 읽거나 자주 사용하는 용어를 정리하는 것도 설계에 도움이 된다.

</details>

<details>
<summary>CRUD 서비스 작성</summary>

**도서관리시스템**
- books, users 테이블

**진행순서**
- DB 작성
- jdbc-db 연결
- java 객체생성
- DAO 작성
- 유저 인터페이스 작성

</details>

### 240328

<details>
<summary>도서 정보 수정, 삭제 메서드 수정</summary>

- like Query문이 제대로 작동하지 않는 문제 발생

</details>

### 240329

<details>
<summary>유저 DAO 및 유저 인터페이스 작성</summary>

- 도서, 유저, 대출정보 메서드를 작성하는 과정에서 Foreign key 사용의 필요성에 대해 생각

</details>

<details>
<summary>대출관리 DAO 및 유저 인터페이스 작성</summary>

</details>