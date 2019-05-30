package com.funtl.hello.spring.cloud.web.admin.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AdminService {

        @Autowired
    private RestTemplate restTemplate;

        public String sayhi(String name){
            return restTemplate.getForObject("http://hello-spring-cloud-service-admin/hi?name="+name,String.class);
        }
}
