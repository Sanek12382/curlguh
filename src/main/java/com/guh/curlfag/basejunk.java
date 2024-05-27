package com.guh.curlfag;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class basejunk {
    @GetMapping(value ="/")
    public String say()
    {return "agony";}
    @GetMapping(value ="/guh")
    public String guh()
    {return "guh";}
}
