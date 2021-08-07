package com.sreejith;

import org.springframework.stereotype.Component;

@Component
public class MyService {

    public String makeUpper(String input)
    {
        return input.toUpperCase();
    }
}
