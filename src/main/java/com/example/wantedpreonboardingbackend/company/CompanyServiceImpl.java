package com.example.wantedpreonboardingbackend.company;

import com.example.wantedpreonboardingbackend.company.dto.CompanyRequestDto;
import com.example.wantedpreonboardingbackend.company.dto.CompanyResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {
    private final CompanyRepository companyRepository;

    public CompanyResponseDto createCompany(CompanyRequestDto requestDto) {
        Company company = new Company(requestDto);

        companyRepository.save(company);

        return new CompanyResponseDto(company);
    };

    public Company getCompany(Long companyId) {
        return companyRepository.findById(companyId).orElseThrow(() -> new IllegalArgumentException("회사를 찾을 수 없습니다."));
    };
}
