package cn.lsy99.spring.demo.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class Tools {
    public String randomString(int len){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < len; i++) {
            stringBuilder.append((char)(Math.random()*26+'A'));
        }
        return stringBuilder.toString();
    }
}
