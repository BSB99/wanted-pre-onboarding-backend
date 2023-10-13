package com.example.wantedpreonboardingbackend.employment.dto;

import com.example.wantedpreonboardingbackend.company.Company;
import com.example.wantedpreonboardingbackend.employment.EmploymentNotice;
import lombok.Getter;

@Getter
public class EmploymentNoticeResponseDto {
    private Long id;

    private String position;

    private String description;

    private String technology;

    private int money;

    private Company company;

    public EmploymentNoticeResponseDto(EmploymentNotice employmentNotice) {
        this.id = employmentNotice.getId();
        this.position = employmentNotice.getPosition();
        this.description = employmentNotice.getDescription();
        this.technology = employmentNotice.getTechnology();
        this.money = employmentNotice.getMoney();
        this.company = employmentNotice.getCompany();
    }
}
