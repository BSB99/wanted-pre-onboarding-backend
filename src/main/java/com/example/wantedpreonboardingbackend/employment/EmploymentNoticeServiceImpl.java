package com.example.wantedpreonboardingbackend.employment;

import com.example.wantedpreonboardingbackend.company.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmploymentNoticeServiceImpl implements EmploymentNoticeService{
    private final CompanyService companyService;
    private final EmploymentNoticeRepository employmentNoticeRepository;

}
