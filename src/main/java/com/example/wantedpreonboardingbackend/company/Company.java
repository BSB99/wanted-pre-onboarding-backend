package com.example.wantedpreonboardingbackend.company;

import com.example.wantedpreonboardingbackend.company.dto.CompanyRequestDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "companys")
@DynamicUpdate
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String country;

    private String region;

    public Company(CompanyRequestDto requestDto) {
        this.name = requestDto.getName();
        this.country = requestDto.getCountry();
        this.region = requestDto.getRegion();
    }
}
