package com.example.wantedpreonboardingbackend.employmentSupport;

import com.example.wantedpreonboardingbackend.employmentSupport.dto.EmploymentSupportRequestDto;
import com.example.wantedpreonboardingbackend.employmentSupport.dto.EmploymentSupportResponseDto;

public interface EmploymentSupportService {
    EmploymentSupportResponseDto createEmploymentSupport(EmploymentSupportRequestDto requestDto);
}
