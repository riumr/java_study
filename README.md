# java_study

### 240305
<details>
<summary>Java 변수 Type의 종류와 성질</summary>

- Type 크기에 맞는 literal을 넣어줘야 한다
- literal의 크기가 더 큰 경우에는 형변환을 해야 오류가 발생하지 않는다.

</details>

### 240306

<details>
<summary>변수 type 변환</summary>

```

```
</details>

<details>
<summary>증감, 산술, 비교, 논리, 삼항 연산자</summary>

```

```
</details>

<details>
<summary>키보드 입력값 받기</summary>

```

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

```
</details>

<details>
<summary>메소드의 선언과 호출, 값 반환</summary>

```

```
</details>

<details>
<summary>메소드 오버로딩, 참조</summary>

```

```
</details>

<details>
<summary>class 이해. instance 생성 및 조작</summary>

```javascript
// 객체 속성 및 메서드 설정

// 상속 : extends

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
<summary>Mysql DB에 연결</summary>

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

