package com.examen.devOps;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundo {

    @RequestMapping("/hola")
    String hellow(){
        return "hola mundo!!!!!";
    }
}
