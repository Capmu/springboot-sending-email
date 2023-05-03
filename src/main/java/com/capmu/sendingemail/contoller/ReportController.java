package com.capmu.sendingemail.contoller;

import com.capmu.sendingemail.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ReportController {

    private final EmailService emailService;

    @GetMapping("/report")
    public ResponseEntity<String> sendEmailReport() {

        emailService.sendSimpleMessage(
                "capmu.explore@gmail.com",
                "Test sending an email using Spring Boot",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
        );

        return ResponseEntity.ok("sent!");
    }
}
