## `virtualbox 포트포워딩 문제`
mobaXterm에서 rocky 6로 연결을 설정하는데 호스트 주소로 설정한 ip주소를 입력해도 접속이 안 됐다.
```markdown
ss -ntl | grep :22
```
rocky6에서 이 명령어로 **22번 포트를 사용중인 주소**를 확인해보니 `0.0.0.0`과 `[::]` 이 두 주소가 나왔다.
- 22번 포트가 열려있지 않거나 ssh 데몬(sshd)이 없다면 sshd를 설치해 주면 된다고 한다.
- rocky6에는 기본적으로 설치되어 있었다.

다른 블로그 문서를 보니 다른 ip주소도 하나 더 뜨던데 내 rocky6에서는 보이지 2개만 보였다.

포트포워딩 설정에서 22번 포트를 사용 중인 `0.0.0.0`과 로컬네트워크의 `virtualbox Host-only Network`에 해당하는 ip주소를 22번 포트로 연결시켰다.
- `virtualbox Host-only Network` ip는 `ipconfig` 명령어를 통해 확인했다. `Host-only`라는 이름이 안 보일 수 있다.

그러고 mobaXterm에서 접속하니 접속이 됐다.

[참고블로그](https://inpa.tistory.com/entry/VM-%F0%9F%92%BF-Virtual-box-%ED%8F%AC%ED%8A%B8%ED%8F%AC%EC%9B%8C%EB%94%A9-%ED%98%B8%EC%8A%A4%ED%8A%B8-%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC-%EC%84%A4%EC%A0%95)