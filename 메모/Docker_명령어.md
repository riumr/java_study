### Docker 명령어
- `whoami` : 현재 사용자명 출력
- `docker run -p (-d) 8080:80 --name Container이름 Image이름`
  - docker container 실행
  - `-p` : publish할 포트 지정
  - `-d` : 백그라운드에서 실행 
  - `run`은 pull과 exec의 기능을 동시에 실행하는 명령어이다.

- `docker cp index.html container명:container 경로`
    - container 내부로 파일을 옮길 수 있다

- `(winpty) docker exec -it container명 bash`
    - 이미지를 `bash`에서 실행
    - `it` interactive typewriter. 텍스트 창으로 상호작용 할 수 있게 한다
    - `Git bash`에서 명령어를 실행할 경우 `winpty`를 붙여야 한다