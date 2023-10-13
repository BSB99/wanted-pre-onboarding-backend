package com.example.wantedpreonboardingbackend.employmentSupport;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/employment-support")
public class EmploymentSupportController {
    private final EmploymentSupportService employmentSupportService;
}
