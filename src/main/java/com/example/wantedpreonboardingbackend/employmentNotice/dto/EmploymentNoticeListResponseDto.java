package com.example.wantedpreonboardingbackend.employmentNotice.dto;

import com.example.wantedpreonboardingbackend.employmentNotice.EmploymentNotice;
import lombok.Getter;

@Getter
public class EmploymentNoticeListResponseDto {
    private Long id;

    public EmploymentNoticeListResponseDto(EmploymentNotice employmentNotice) {
        this.id = employmentNotice.getId();
    }
}
