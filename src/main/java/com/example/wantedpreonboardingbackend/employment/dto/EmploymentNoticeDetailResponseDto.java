package com.example.wantedpreonboardingbackend.employment.dto;

import com.example.wantedpreonboardingbackend.employment.EmploymentNotice;
import lombok.Getter;

@Getter
public class EmploymentNoticeDetailResponseDto {
    private Long id;
    private String company_name;
    private String country;
    private String region;
    private String position;
    private int money;
    private String technology;
    private String description;

    public EmploymentNoticeDetailResponseDto(EmploymentNotice employmentNotice) {
        this.id = employmentNotice.getId();
        this.company_name = employmentNotice.getCompany().getName();
        this.country = employmentNotice.getCompany().getCountry();
        this.region = employmentNotice.getCompany().getRegion();
        this.position = employmentNotice.getPosition();
        this.money = employmentNotice.getMoney();
        this.technology = employmentNotice.getTechnology();
        this.description = employmentNotice.getDescription();
    }
}
