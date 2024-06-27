## 자동 생성되는 Docker Container Volume

`docker container`를 생성하면 `익명 volume`이 자동생성되며 메모리를 차지한다.

사용하지 않는 volume은 container를 종료한 후에도 존재한다.

그것들을 한번에 삭제하려면
```shell
docker volume prune
```

명령어를 입력하면 된다