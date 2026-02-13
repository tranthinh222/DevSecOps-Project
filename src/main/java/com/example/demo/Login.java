package com.example.demo;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
class LoginController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello(@RequestParam String name) {
        return ResponseEntity.ok().contentType(MediaType.TEXT_HTML)
            .body("<html><body>Hello " + name + "</body></html>");
    }

}