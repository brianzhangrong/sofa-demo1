package com.ihomefnt.ark.demo.controller;

//import com.alibaba.dubbo.config.annotation.Service;
import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.ihomefnt.ark.inter.Demo1Interface;
import org.springframework.stereotype.Service;

@Service
@SofaService
public class Demo1Service implements Demo1Interface {

    @Override
    public String demo1() {
        return "demo1 service demo1";
    }
}
