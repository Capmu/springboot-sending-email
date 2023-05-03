package com.capmu.sendingemail.contoller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportController {

    @GetMapping("/report")
    public ResponseEntity<String> sendEmailReport() {

        return ResponseEntity.ok("sent!");
    }
}
