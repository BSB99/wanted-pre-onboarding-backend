package com.example.wantedpreonboardingbackend.employmentSupport;

import com.example.wantedpreonboardingbackend.employmentNotice.EmploymentNotice;
import com.example.wantedpreonboardingbackend.employmentNotice.EmploymentNoticeService;
import com.example.wantedpreonboardingbackend.employmentSupport.dto.EmploymentSupportRequestDto;
import com.example.wantedpreonboardingbackend.employmentSupport.dto.EmploymentSupportResponseDto;
import com.example.wantedpreonboardingbackend.user.User;
import com.example.wantedpreonboardingbackend.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmploymentSupportServiceImpl implements EmploymentSupportService {
    private final EmploymentSupportRepository employmentSupportRepository;
    private final UserService userService;
    private final EmploymentNoticeService employmentNoticeService;

    public EmploymentSupportResponseDto createEmploymentSupport(EmploymentSupportRequestDto requestDto) {
        EmploymentNotice employmentNotice = employmentNoticeService.getEmploymentNotice(requestDto.getEmploymentNoticeId());
        User user = userService.getUser(requestDto.getUserId());

        if (employmentSupportRepository.findByUserAndEmploymentNotice(user, employmentNotice).isPresent()) {
            throw new IllegalArgumentException("기업 하나에 지원은 최대 1번 입니다!");
        }

        EmploymentSupport employmentSupport = new EmploymentSupport(employmentNotice, user);

        employmentSupportRepository.save(employmentSupport);

        return new EmploymentSupportResponseDto(employmentSupport);
    }
}
