package com.example.wantedpreonboardingbackend.company;

import com.example.wantedpreonboardingbackend.company.dto.CompanyRequestDto;
import com.example.wantedpreonboardingbackend.company.dto.CompanyResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/company")
public class CompanyController {
    private final CompanyService companyService;

    @PostMapping
    public ResponseEntity<CompanyResponseDto> createCompany(@RequestBody CompanyRequestDto requestDto) {
        CompanyResponseDto result = companyService.createCompany(requestDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }
}
