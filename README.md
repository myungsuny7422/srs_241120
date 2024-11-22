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

![image](https://github.com/user-attachments/assets/7d20cd49-7cb7-4377-952d-5b33e35459b1)

## 3-1. 단일 진입점 - Gateway
- 기동된 예약서비스(8082, reserve) 와 gateway(8088) 를 통한 서비스 호출

![image](https://github.com/user-attachments/assets/bf594af7-465c-43c6-b661-f29c9c345305)

## 3-2. 분산 데이터 프로젝션 - CQRS
- 좌석(seat) 서비스와 인사(hr) 서비스를 참조하는 dashboard 모델

![image](https://github.com/user-attachments/assets/02c593b9-7f8c-40ce-99de-fe6add4666a4)

## Model
www.msaez.io/#/188553407/storming/srs
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

