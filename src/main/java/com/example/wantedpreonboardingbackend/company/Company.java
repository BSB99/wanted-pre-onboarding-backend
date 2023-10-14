package com.example.wantedpreonboardingbackend.company;

import com.example.wantedpreonboardingbackend.company.dto.CompanyRequestDto;
import com.example.wantedpreonboardingbackend.employmentNotice.EmploymentNotice;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "companys")
@DynamicUpdate
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String country;

    @Column(nullable = false)
    private String region;

    @JsonIgnore
    @OneToMany(mappedBy = "company")
    private List<EmploymentNotice> employmentNoticesList = new ArrayList<>();

    public Company(CompanyRequestDto requestDto) {
        this.name = requestDto.getName();
        this.country = requestDto.getCountry();
        this.region = requestDto.getRegion();
    }
}
