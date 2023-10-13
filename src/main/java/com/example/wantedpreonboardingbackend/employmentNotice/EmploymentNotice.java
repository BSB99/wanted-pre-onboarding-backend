package com.example.wantedpreonboardingbackend.employmentNotice;

import com.example.wantedpreonboardingbackend.company.Company;
import com.example.wantedpreonboardingbackend.employmentNotice.dto.EmploymentNoticeRequestDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "employment_notices")
@DynamicUpdate
public class EmploymentNotice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String position;

    private String description;

    private String technology;

    private int money;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
    public EmploymentNotice(EmploymentNoticeRequestDto requestDto, Company company) {
        this.position = requestDto.getPosition();
        this.description = requestDto.getDescription();
        this.technology = requestDto.getTechnology();
        this.money = requestDto.getMoney();
        this.company = company;
    }
}
