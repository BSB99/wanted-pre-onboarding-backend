package com.example.wantedpreonboardingbackend.employment.dto;

import lombok.Getter;

@Getter
public class EmploymentNoticeRequestDto {
    private String position;

    private String description;

    private String technology;

    private int money;

    private Long companyId;
}
