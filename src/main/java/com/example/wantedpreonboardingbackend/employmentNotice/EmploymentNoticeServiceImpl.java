package com.example.wantedpreonboardingbackend.employmentNotice;

import com.example.wantedpreonboardingbackend.common.ApiResponseDto;
import com.example.wantedpreonboardingbackend.company.Company;
import com.example.wantedpreonboardingbackend.company.CompanyService;
import com.example.wantedpreonboardingbackend.employmentNotice.dto.EmploymentNoticeDetailResponseDto;
import com.example.wantedpreonboardingbackend.employmentNotice.dto.EmploymentNoticeRequestDto;
import com.example.wantedpreonboardingbackend.employmentNotice.dto.EmploymentNoticeResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmploymentNoticeServiceImpl implements EmploymentNoticeService{
    private final CompanyService companyService;
    private final EmploymentNoticeRepository employmentNoticeRepository;

    public EmploymentNoticeDetailResponseDto getEmploymentNoticeInfo(Long employmentNoticeId) {
        EmploymentNotice employmentNotice = getEmploymentNotice(employmentNoticeId);

        return new EmploymentNoticeDetailResponseDto(employmentNotice);
    }

    public List<EmploymentNoticeResponseDto> getEmploymentNoticeList(Pageable pageable) {
        return employmentNoticeRepository
                .findAllByOrderById(pageable)
                .stream()
                .map(EmploymentNoticeResponseDto::new)
                .toList();
    }

    public List<EmploymentNoticeResponseDto> getSearchEmploymentNoticeList(Pageable pageable, String content) {
        return employmentNoticeRepository.searchEmploymentNoticeList(pageable, content).stream().map(EmploymentNoticeResponseDto::new).toList();
    }

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

    @Transactional
    public ApiResponseDto deleteEmploymentNotice(Long employmentNoticeId) {
        EmploymentNotice employmentNotice = getEmploymentNotice(employmentNoticeId);

        employmentNoticeRepository.delete(employmentNotice);

        return new ApiResponseDto("기업공고가 삭제되었습니다.", 200);
    }

    public EmploymentNotice getEmploymentNotice(Long employmentNoticeId) {
        return employmentNoticeRepository.findById(employmentNoticeId).orElseThrow(() -> new IllegalArgumentException("기업공고를 찾을 수 없습니다."));
    }
}
