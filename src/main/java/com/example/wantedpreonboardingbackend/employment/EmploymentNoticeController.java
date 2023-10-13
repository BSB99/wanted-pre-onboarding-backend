package com.example.wantedpreonboardingbackend.employment;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/employment-notice")
public class EmploymentNoticeController {
    private final EmploymentNoticeService employmentNoticeService;
}
