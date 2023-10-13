package com.example.wantedpreonboardingbackend.employment;

import com.example.wantedpreonboardingbackend.company.Company;
import com.example.wantedpreonboardingbackend.company.CompanyService;
import com.example.wantedpreonboardingbackend.employment.dto.EmploymentNoticeRequestDto;
import com.example.wantedpreonboardingbackend.employment.dto.EmploymentNoticeResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional
    public EmploymentNoticeResponseDto updateEmploymentNotice(EmploymentNoticeRequestDto requestDto, Long employmentNoticeId) {
        EmploymentNotice employmentNotice = getEmploymentNotice(employmentNoticeId);

        employmentNotice.setDescription(requestDto.getDescription());
        employmentNotice.setPosition(requestDto.getPosition());
        employmentNotice.setTechnology(requestDto.getTechnology());
        employmentNotice.setMoney(requestDto.getMoney());

        if(!employmentNotice.getCompany().getId().equals(requestDto.getCompanyId())) {
            Company company = companyService.getCompany(requestDto.getCompanyId());

            employmentNotice.setCompany(company);
        }

        return new EmploymentNoticeResponseDto(employmentNotice);
    };

    public EmploymentNotice getEmploymentNotice(Long employmentNoticeId) {
        return employmentNoticeRepository.findById(employmentNoticeId).orElseThrow(() -> new IllegalArgumentException("기업공고를 찾을 수 없습니다."));
    }
}
