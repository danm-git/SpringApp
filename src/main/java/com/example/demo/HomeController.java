package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class HomeController {

    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/streamapi")
    public StreamApiResponse streamapi() {
        return new StreamApiResponse("Response");
    }

    record StreamApiResponse(String streamApi) {}

}

