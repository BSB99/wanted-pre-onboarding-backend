package com.example.wantedpreonboardingbackend.employmentSupport.dto;

import com.example.wantedpreonboardingbackend.employmentSupport.EmploymentSupport;
import lombok.Getter;

@Getter
public class EmploymentSupportResponseDto {
    private Long employmentNoticeId;

    private Long userId;

    public EmploymentSupportResponseDto(EmploymentSupport employmentSupport) {
        this.employmentNoticeId = employmentSupport.getEmploymentNotice().getId();
        this.userId = employmentSupport.getUser().getId();
    }
}
