- /api/sms/send
1. Coolsms 계정을 생성하고 API 키와 시크릿을 발급받습니다.
2. application.properties에 발급받은 키와 시크릿, 그리고 발신자 번호를 설정합니다. 
3. 다음과 같이 API를 호출하여 SMS를 전송할 수 있습니다
```
curl -X POST http://localhost:8080/api/sms/send \
-H "Content-Type: application/json" \
-d '{
    "phoneNumber": "01012345678",
    "content": "테스트 메시지입니다."
}'
```