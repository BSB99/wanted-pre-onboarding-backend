package com.example.wantedpreonboardingbackend.employment;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmploymentNoticeRepository extends JpaRepository<EmploymentNotice, Long>, EmploymentNoticeQuery {
    Page<EmploymentNotice> findAllByOrderById(Pageable pageable);
}
