package com.example.Hello.RestHandler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("users")
public class MyFirstRest {
    @GetMapping("/status/check")
    public String status() {
        return "working";
    }

    @PostMapping("jiaki")
    public String jiaki(@RequestBody String body) {
      return "You said "+body+".";
    }
}
