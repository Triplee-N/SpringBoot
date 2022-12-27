package com.example.avoz;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class homeController {

    @GetMapping
    public String home() {
        return "✨✨ Welcome to SpringBoot ✨✨";
    }
}
