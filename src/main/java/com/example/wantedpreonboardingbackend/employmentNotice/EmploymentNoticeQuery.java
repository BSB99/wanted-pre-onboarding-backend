package com.example.wantedpreonboardingbackend.employmentNotice;

import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmploymentNoticeQuery {
    List<EmploymentNotice> searchEmploymentNoticeList(Pageable pageable, String content);
}
