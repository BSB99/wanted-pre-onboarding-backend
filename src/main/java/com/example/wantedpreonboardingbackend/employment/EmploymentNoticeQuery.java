package com.example.wantedpreonboardingbackend.employment;

import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmploymentNoticeQuery {
    List<EmploymentNotice> searchEmploymentNoticeList(Pageable pageable, String content);
}
