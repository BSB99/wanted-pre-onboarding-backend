package com.example.wantedpreonboardingbackend.company.dto;

import com.example.wantedpreonboardingbackend.company.Company;
import lombok.Getter;

@Getter
public class CompanyResponseDto {
    private Long id;
    private String name;
    private String country;
    private String region;

    public CompanyResponseDto(Company company) {
        this.id = company.getId();
        this.name = company.getName();
        this.country = company.getCountry();
        this.region = company.getRegion();
    }
}
