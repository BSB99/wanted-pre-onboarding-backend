package com.example.wantedpreonboardingbackend.employment;

import com.example.wantedpreonboardingbackend.company.Company;
import com.example.wantedpreonboardingbackend.company.CompanyService;
import com.example.wantedpreonboardingbackend.employment.dto.EmploymentNoticeRequestDto;
import com.example.wantedpreonboardingbackend.employment.dto.EmploymentNoticeResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmploymentNoticeServiceImpl implements EmploymentNoticeService{
    private final CompanyService companyService;
    private final EmploymentNoticeRepository employmentNoticeRepository;

    public EmploymentNoticeResponseDto createEmploymentNotice(EmploymentNoticeRequestDto requestDto) {
        Company company = companyService.getCompany(requestDto.getCompanyId());
        EmploymentNotice employmentNotice = new EmploymentNotice(requestDto, company);

        employmentNoticeRepository.save(employmentNotice);

        return new EmploymentNoticeResponseDto(employmentNotice);
    }
}
