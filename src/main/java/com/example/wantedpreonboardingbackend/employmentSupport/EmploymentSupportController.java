package com.example.wantedpreonboardingbackend.employmentSupport;

import com.example.wantedpreonboardingbackend.employmentSupport.dto.EmploymentSupportRequestDto;
import com.example.wantedpreonboardingbackend.employmentSupport.dto.EmploymentSupportResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/employment-support")
public class EmploymentSupportController {
    private final EmploymentSupportService employmentSupportService;

    @PostMapping
    public ResponseEntity<EmploymentSupportResponseDto> createEmploymentSupport(@RequestBody EmploymentSupportRequestDto requestDto) {
        EmploymentSupportResponseDto result = employmentSupportService.createEmploymentSupport(requestDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }
}
