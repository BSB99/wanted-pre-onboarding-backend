package com.example.wantedpreonboardingbackend.employment;

import com.example.wantedpreonboardingbackend.employment.dto.EmploymentNoticeRequestDto;
import com.example.wantedpreonboardingbackend.employment.dto.EmploymentNoticeResponseDto;

public interface EmploymentNoticeService {
    EmploymentNoticeResponseDto createEmploymentNotice(EmploymentNoticeRequestDto requestDto);
}
