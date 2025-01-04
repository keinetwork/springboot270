package com.example.demo.coolsms.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SmsRequest {
    private String phoneNumber;
    private String content;
}