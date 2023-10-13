package com.example.wantedpreonboardingbackend.employment;

import com.example.wantedpreonboardingbackend.common.ApiResponseDto;
import com.example.wantedpreonboardingbackend.employment.dto.EmploymentNoticeRequestDto;
import com.example.wantedpreonboardingbackend.employment.dto.EmploymentNoticeResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmploymentNoticeService {
    EmploymentNoticeResponseDto createEmploymentNotice(EmploymentNoticeRequestDto requestDto);

    EmploymentNoticeResponseDto updateEmploymentNotice(EmploymentNoticeRequestDto requestDto, Long employmentNoticeId);

    ApiResponseDto deleteEmploymentNotice(Long employmentNoticeId);

    List<EmploymentNoticeResponseDto> getEmploymentNoticeList(Pageable pageable);

    List<EmploymentNoticeResponseDto> getSearchEmploymentNoticeList(Pageable pageable, String content);
}
