package com.hooda.springboot.reactiveRestWebService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import reactor.core.publisher.Flux;

@Controller
public class RootController {
    @GetMapping("/")
    @ResponseBody
    public Flux<String> getRoot() {
        return Flux.just("Alive");
    }

}
