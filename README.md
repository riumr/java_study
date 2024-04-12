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

```java
//char를 String으로 변환
String s2 = '3' + "";

//String을 char로 변환
char c4 = s2.charAt(0);
```
</details>

<details>
<summary>증감, 산술, 비교, 논리, 삼항 연산자</summary>

```java
//조건연산 (삼항연산)
boolean b4 = (1 != 1) ? true : false;
```
</details>

<details>
<summary>키보드 입력값 받기</summary>

```java
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

```java
switch (조건) {
  case 결과 -> {
  ...
} default -> {
  ...
}

//개선된 조건문
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
// singleton 패턴이 캡슐화를 사용하는 대표적인 방법이다

// 다형성 : @override (annotation)
// 하나의 객체가 여러가지 타입을 가질 수 있는 것 

```

</details>

### 240308

<details>
<summary>class의 구성요소</summary>

```
- 멤버(필드, 메서드), 생성자
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
this로 가리키는 변수는 메서드의 변수이다.
```

</details>

### 240311

<details>
<summary>singleton 객체 : 중요</summary>

```
사용하는 이유 : 변수를 초기화 해놓는 것처럼 객체의 멤버들을 초기화 해놓기 위해 사용한다.
- 메모리를 절약할 수 있다

```
</details>

<details>
<summary>배열(Array)</summary>

```

```
</details>

<details>
<summary>문자열 메서드</summary>

```

```
</details>

### 240312

<details>
<summary>객체로 구성된 배열</summary>

```java
Ball[] balls = new Ball[5];
```

</details>

<details>
<summary>가변개수 매개변수</summary>

```java
public static void sumAndPrint(int...v){
  int sum = 0;
  for (int i : v) {
    sum+=i;
  };
```

</details>

### 240313

<details>
<summary>객체 상속</summary>

```
- super()를 통해 부모의 필드값 사용 가능
- super로 호출시 모든 필드를 정의해줘야 한다
- 접근제한자에 따라 상속받을 수 있는 필드가 다르다.
```
</details>

<details>
<summary>다형성</summary>

```
- 부모 생성자를 매개변수로 가지는 메서드에 해당 객체를 매개변수로 넣기 위해 사용될 수 있다
- 부모 생성자로 upcasting하면 부모 요소의 멤버만 사용할 수 있다.
```
</details>

<details>
<summary>접근지정자 범위</summary>

```
- public > protected > default > private
```

</details>

### 240314

<details>
<summary>배열에 객체 담을 시 자동 upcasting</summary>

```
- 자식요소를 배열에 넣는 과정에서 자동형변환된다.
```
</details>

<details>
<summary>Instanceof 연산자 활용. Type 검증</summary>

```
- V instanceof Type v
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
** Class 별 메소드 **

`Object 클래스`
- equals(), toString()

`Class`
- getClass(), getSimpleName(), getTypeName(), getName() 

`System`
- currentTimeMills(), nanoTime(), arraycopy()

`StringBuilder`
- String 클래스와 동일하게 사용할 수 있는 클래스
- 변경될 수 있는 문자열은 StringBuilder 클래스 사용
- StringBuilder는 같은 주소값의 객체를 수정할 수 있도록 하기 때문이다

`Wrapper 포장클래스`
```markdown
Integer, String, Double 등이 있으며, 기초 변수 타입과 동일한 기능을 해준다.
이를 사용해 단순한 변수 타입의 객체도 Java 기본 패키지를 사용할 수 있다.
```

`Calendar`
- PM, MONTH, HOUR

`Arrays`
- copyOf(), binarySearch()

`Random`
- nextInt()

`MessageFormat`
- String type 값을 반환한다

`StringTokenizer`
- StringTokenizer st = new StringTokenizer(s," ,");
- countTokens();

</details>

<details>
<summary>Generic 타입 객체 ArrayList<></summary>

```java
ArrayList<Integer> ai = new ArrayList<>();
ArrayList<String> as= new ArrayList<>();
ArrayList<Object> ao = new ArrayList<>();
```

</details>

<details>
<summary>Garbage collector 수동 호출</summary>

- System.gc();

</details>

### 240319

<details>
<summary>예외처리</summary>

</details>

<details>
<summary>Generic type 클래스</summary>

```java
// 2개 이상의 매개변수를 가지는 Generic type
public class Entry<K,V> {
  private K key;
  private V value;

  public Entry(K key, V value) {
    this.key = key;
    this.value = value;
  }

  public K getKey() {
    return key;
  }

  public void setKey(K key) {
    this.key = key;
  }

  public V getValue() {
    return value;
  }

  public void setValue(V value) {
    this.value = value;
  }

}
```

</details>

<details>
<summary>함수형 interface(lambda) 사용</summary>

- 인터페이스를 구현한 익명객체의 method를 overridng하는 원리로 만들어진다.

</details>

<details>
<summary>참조</summary>

```java
 Mathemetical m;
// m = d->Math.abs(d);
m = Math::abs;
```
</details>

### 240320

<details>
<summary>LinkedList 클래스</summary>

```java
LinkedList<Integer> l1 = new LinkedList<>();
```

</details>

<details>
<summary>List collection</summary>

```java

```

</details>

<details>
<summary>Set collection</summary>

```java
Set<String> set = Set.of("a","b","c");
HashSet<String> hashSet = new HashSet<>(set);
TreeSet<String> treeSet = new TreeSet<>(set);
```

</details>

<details>
<summary>Stack 클래스</summary>

```java
Stack<Integer> i1 = new Stack<>();
```

</details>

<details>
<summary>queue 컬렉션</summary>

```java
Queue<String> q = new LinkedList<>();
```

</details>

<details>
<summary>Map 인터페이스</summary>

```java
Map<String,Integer> fruits = Map.of("사과",5,"바나나",3,"딸기",2);
```

</details>

<details>
<summary>HashMap 클래스</summary>

```java
// HashMap 클래스
HashMap<String,Integer> hashMap = new HashMap<>(fruits);
```

</details>

<details>
<summary>Collections 클래스 메소드</summary>

- sort(), reverse(), shuffle()

</details>

### 240321

<details>
<summary>Stream</summary>

- Stream<T> = Stream.of(배열)
- 느긋한 연산. 요소를 요구하기 전까지 작업하지 않는다

</details>

<details>
<summary>Stream과 collections 사용 방식 비교</summary>

```java
// collections
List<Integer> gt10 = new ArrayList<>();
for (Integer i : list) {
  if (i > 10) {
    gt10.add(i);
  }
}
Collections.sort(gt10);
System.out.println(gt10);

// stream
list.stream().filter(i -> i > 10).sorted().forEach(x -> System.out.print(x + " "));
```

</details>

<details>
<summary>Stream 정렬</summary>

```java
Stream<Nation> n1 = Nation.nations.stream();
Stream<Nation> sorted = n1.sorted(Comparator.comparing(Nation::getGdpRank));
```

</details>

<details>
<summary>Stream 매핑</summary>

```java
Stream<String> s1 = Stream.of("a1", "b1", "b1", "c1", "c2", "c3");
Stream<String> s2 = s1.map(String::toUpperCase);
```

</details>

<details>
<summary>Stream 매칭과 검색</summary>

```java
// 매칭. allMatch
if(Nation.nations.stream().allMatch(d->d.getPopulation()>100.0)){
  System.out.println("모든 국가의 인구가 1억이 넘는다");
} else {
  System.out.println("모든 국가의 인구가 1억이 넘지는 않는다.");
}

// 검색
Optional<Nation> any = Nation.nations.stream().filter(Nation::isIsland).findAny();
```

</details>

<details>
<summary>Stream 단순집계</summary>

```java
IntStream intStream2 = IntStream.of(5, 1, 2, 3);
System.out.println(intStream2.count());
```

</details>

<details>
<summary>Stream filtering</summary>

- filter와 함께 사용하는 메서드 : skip(), distinct(), limit()

</details>

<details>
<summary>Stream Collectors Grouping, partitioning</summary>

```java
// 기준에 따른 Group 만들기
Stream<Nation> s1 = Nation.nations.stream();
List<String> slist = s1.map(Nation::getName).collect(Collectors.toList());
Map<Nation.Type, Long> collect1 = s2.collect(Collectors.groupingBy(Nation::getType, Collectors.counting()));

// 이분법으로 나누기
Stream<Nation> sn = Nation.nations.stream();
Map<Boolean, Long> collect = sn.collect(Collectors.partitioningBy(
    n -> n.getType() == Nation.Type.LAND,
    Collectors.counting()
));
```
</details>

<details>
<summary>Optional 타입</summary>

```java
Optional<String> s = Optional.of("apple");
Util.print(s);
System.out.println(Optional.ofNullable(null));
System.out.println(Optional.ofNullable(null).orElse("null"));
```

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

```java
// 바이트 단위의 이진 데이터를 다루므로 이미지나 동영상 파일을 처리할 때 유용
int read=System.in.read();
System.out.write(read);
```

</details>

<details>
<summary>FileStream 클래스. 모든 파일을 읽고 쓸 수 있음</summary>

```java
String input = "C:\\Temp\\org.txt";
String output = "C:\\Temp\\target.txt";
int read;
try {
  FileInputStream fis = new FileInputStream(input);
  FileOutputStream fos = new FileOutputStream(output);
  while((read = fis.read()) != -1){
    fos.write(read);
  }
} catch (FileNotFoundException e) {
  System.out.println("해당 파일을 찾을 수 없습니다");
} catch (IOException e){
  throw new RuntimeException(e);
}
```

</details>

<details>
<summary>Thread 상속</summary>

- 객체에 Thread를 상속받아서 Thread 제어 메서드를 사용할 수 있다.

</details>

<details>
<summary>Socket 클래스로 Client, server 구현</summary>

```java
// Client
try {
Socket client = new Socket("localhost", 5000);
OutputStream os = client.getOutputStream();
ObjectOutputStream oos = new ObjectOutputStream(os);
  oos.writeObject("안녕, 단순 서버야");
  oos.flush();
} catch (Exception e) {
};

// Server
try {
ServerSocket server = new ServerSocket(5000);
Socket connection = server.accept();
InputStream is = connection.getInputStream();
ObjectInputStream ois = new ObjectInputStream(is);
String s = (String) ois.readObject();
System.out.println("받은 문자열 : "+s);
} catch (Exception e) {

}

```

</details>

<details>
<summary>jdbc로 Mysql DB에 연결</summary>

**과정 순서**
- intellij에 MySQL 드라이버 설정
  - file - project structure - libraries - mysql-connector-java. choose module
```java
// JDBC드라이버 로드 및 데이터베이스 연결
Class.forName("com.mysql.cj.jdbc.Driver");

// 데이터베이스와 연결해 Connection 객체 생성
String url = "jdbc:mysql://localhost/foodcon?serverTimezone=Asia/Seoul";
connect = DriverManager.getConnection(url, "root", "password");

// SQL 문 실행
// sql 작성
String sql = "delete from mytable where id=?;";
// statement 객체 생성 -> set 메서드를 이용해서 변수값을 설정
PreparedStatement ps = con.prepareStatement(sql);
// statement 객체. executeQuery/executeUpdate 를 사용해서 query 실행
ps.setInt(1,3);
ps.executeUpdate();
ps.close();
con.close();
```

</details>

<details>
<summary>Mysql DB에 값 추가(insert into)</summary>

```java
String sql = "insert into checkout values ...;";
PreparedStatement statement = con.prepareStatement(sql);
statement.setInt(1,value);
statement.executeUpdate();
statement.close();
con.close();
```
  
</details>

<details>
<summary>Mysql DB 가져오기(select)</summary>

```java
String sql = "select id from checkout;";
PreparedStatement ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery();
List<Checkout> checkoutList = new LinkedList<>();
if (rs != null){
    while(rs.next()){
      Checkout checkout = new Checkout(rs.getInt(1));
      checkoutList.add(checkout);
    };
    return checkoutList;
}
```

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

<details>
<summary>요구사항 명세서 작성</summary>

[도서대여_미니프로젝트_명세서](도서대여_미니프로젝트_명세서.pdf)

- 필요 기능 정의 (도메인 관련 문서 참고)
- 기능별 DAO 구성(`CRUD` 원칙 적용)
- DAO별 메소드 이름 및 반환 타입 정의
- 정의한 메소드 참고 DB 구성

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

- 임의의 객체를 생성해 TDD 방식으로 프로그램을 검증 할 수 있다.

</details>