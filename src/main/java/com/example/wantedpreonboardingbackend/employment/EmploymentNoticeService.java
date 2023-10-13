package com.example.wantedpreonboardingbackend.employment;

import com.example.wantedpreonboardingbackend.common.ApiResponseDto;
import com.example.wantedpreonboardingbackend.employment.dto.EmploymentNoticeRequestDto;
import com.example.wantedpreonboardingbackend.employment.dto.EmploymentNoticeResponseDto;

public interface EmploymentNoticeService {
    EmploymentNoticeResponseDto createEmploymentNotice(EmploymentNoticeRequestDto requestDto);

    EmploymentNoticeResponseDto updateEmploymentNotice(EmploymentNoticeRequestDto requestDto, Long employmentNoticeId);

    ApiResponseDto deleteEmploymentNotice(Long employmentNoticeId);
}
