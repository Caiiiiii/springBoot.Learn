package com.service.oneThreeOne;

import org.springframework.stereotype.Service;

@Service
public class FunctionService {
    public String sayHello(String word){
        return "Hello " + word + "!";
    }
}
