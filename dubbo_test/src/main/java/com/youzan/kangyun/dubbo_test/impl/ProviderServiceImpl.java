package com.youzan.kangyun.dubbo_test.impl;

import com.youzan.kangyun.dubbo_test.ProviderService;

public class ProviderServiceImpl implements ProviderService {
    public String hello(String name) {
        return "Hello " + name + "!";
    }

}
