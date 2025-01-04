package com.example.demo.coolsms.controller;

import com.example.demo.coolsms.dto.SmsRequest;
import com.example.demo.coolsms.service.SmsService;
import net.nurigo.sdk.message.model.Balance;
import net.nurigo.sdk.message.response.MessageListResponse;
import net.nurigo.sdk.message.response.SingleMessageSentResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sms")
public class SmsController {

    private final SmsService smsService;


    public SmsController(SmsService smsService) {
        this.smsService = smsService;
    }

    @PostMapping("/send")
    public ResponseEntity<SingleMessageSentResponse> sendSms(@RequestBody SmsRequest request) {
        SingleMessageSentResponse response = smsService.sendSms(request.getPhoneNumber(), request.getContent());
        return ResponseEntity.ok(response);
    }


    /**
     * 메시지 조회 예제
     */
    @GetMapping("/get-message-list")
    public MessageListResponse getMessageList() {
        return smsService.getMessageList();
    }
    /**
     * 잔액 조회
     */
    @GetMapping("/get-balance")
    public Balance getBalance() {
        return smsService.getBalance();
    }
} 