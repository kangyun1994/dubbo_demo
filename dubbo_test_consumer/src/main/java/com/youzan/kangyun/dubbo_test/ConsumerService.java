package com.youzan.kangyun.dubbo_test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConsumerService {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-consumer.xml"});
        context.start();
        ProviderService providerService = (ProviderService) context.getBean("providerService");
        System.out.println(providerService.hello("kangyun"));
    }
}
