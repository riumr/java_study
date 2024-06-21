### Linux 명령어
- echo 저장할 내용 >> /경로/파일 : 파일에 내용을 덮어쓰거나 해당 내용이 들어있는 새 파일을 만들 수 있다
    - echo 내용 ; 내용을 터미널에 전송한다
- ping ip주소 : 해당 ip 주소로 테스트 요청을 보낸다
- fuser -k -n 8080 : port 8080에 실행되고 있는 프로세스를 종료한다
    - `fuser` : 프로세스를 식별하기 위해 맨 앞에 붙는 명령어이다
    - `-n` : 네트워크 관련 네임스페이스 지정에 사용한다
- sudo -s : super user로 전환
- su 유저명 : 해당 유저로 전환
- scp(secure copy protocol) : 원격 네트워크로의 파일전송 프로토콜이다
    - scp 전송할 파일 호스트주소:디렉터리/수신파일명

- docker, docker compose 설치 명령어
```
sudo apt-get update && \
sudo apt-get install -y apt-transport-https ca-certificates curl software-properties-common && \
curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add - && \
sudo apt-key fingerprint 0EBFCD88 && \
sudo add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable" && \
sudo apt-get update && \
sudo apt-get install -y docker-ce && \
sudo usermod -aG docker ubuntu && \
sudo curl -L "https://github.com/docker/compose/releases/download/1.23.2/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose && \
sudo chmod +x /usr/local/bin/docker-compose && \
sudo ln -s /usr/local/bin/docker-compose /usr/bin/docker-compose
```
