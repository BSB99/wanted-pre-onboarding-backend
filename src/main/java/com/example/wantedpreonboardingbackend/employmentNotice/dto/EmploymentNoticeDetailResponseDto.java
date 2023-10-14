package com.example.wantedpreonboardingbackend.employmentNotice.dto;

import com.example.wantedpreonboardingbackend.employmentNotice.EmploymentNotice;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

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
    private List<Long> companyOpenPositionList;

    public EmploymentNoticeDetailResponseDto(EmploymentNotice employmentNotice) {
        this.id = employmentNotice.getId();
        this.company_name = employmentNotice.getCompany().getName();
        this.country = employmentNotice.getCompany().getCountry();
        this.region = employmentNotice.getCompany().getRegion();
        this.position = employmentNotice.getPosition();
        this.money = employmentNotice.getMoney();
        this.technology = employmentNotice.getTechnology();
        this.description = employmentNotice.getDescription();
        if (employmentNotice.getCompany().getEmploymentNoticesList() != null) {
            this.companyOpenPositionList = employmentNotice.getCompany().getEmploymentNoticesList().stream()
                    .filter(e -> !e.getId().equals(this.id))
                    .map(EmploymentNotice::getId)
                    .toList();
        }
    }
}