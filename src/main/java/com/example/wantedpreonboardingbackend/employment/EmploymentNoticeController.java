package com.example.wantedpreonboardingbackend.employment;

import com.example.wantedpreonboardingbackend.employment.dto.EmploymentNoticeRequestDto;
import com.example.wantedpreonboardingbackend.employment.dto.EmploymentNoticeResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/employment-notice")
public class EmploymentNoticeController {
    private final EmploymentNoticeService employmentNoticeService;

    @PostMapping
    public ResponseEntity<EmploymentNoticeResponseDto> createEmploymentNotice(@RequestBody EmploymentNoticeRequestDto requestDto) {
        EmploymentNoticeResponseDto result = employmentNoticeService.createEmploymentNotice(requestDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }
}
