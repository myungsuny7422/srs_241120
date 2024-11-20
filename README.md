## 1.클라우드 아키텍쳐 설계
- KTDS 자리예약시스템
## 서비스 시나리오
기능적 요구사항
1. 관리자가 자리를 등록한다.
1. 직원이 자리를 선택하여 예약한다.
1. 예약과 동시에 인사시스템 내 자리 위치를 업데이트 한다.
    1. 자리 반납 / 예약 취소시에는 내 자리 위치가 초기화된다.
1. 자리의 등록/예약/예약취소/반납 시, 자리의 상태가 변경되어 대쉬보드에 반영된다.

## 2. Data Modeling / 서비스 분리/설계
## 도메인 분석 (이벤트 스토밍)
![image](https://github.com/user-attachments/assets/20b020fc-31ad-41a5-8d86-996ab45d9064)

## 3. 클라우드 네이티브 개발
## 3-1. 마이크로 서비스 실행
1. reserve : 8082
1. seat : 8083
1. hr : 8084
1. dashboard : 8085
## 3-1. 단일 진입점 - Gateway

## Model
www.msaez.io/#/188553407/storming/srs

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd infra
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- reserve
- seat
- hr
- dashboard


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- reserve
```
 http :8088/reserves id="id" 
```
- seat
```
 http :8088/seats id="id" 
```
- hr
```
 http :8088/hrs id="id" 
```
- dashboard
```
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

