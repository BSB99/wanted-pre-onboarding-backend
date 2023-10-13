package com.example.wantedpreonboardingbackend.employmentSupport;

import com.example.wantedpreonboardingbackend.employmentNotice.EmploymentNoticeService;
import com.example.wantedpreonboardingbackend.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmploymentSupportServiceImpl implements EmploymentSupportService {
    private final EmploymentSupportRepository employmentSupportRepository;
    private final UserService userService;
    private final EmploymentNoticeService employmentNoticeService;
}
