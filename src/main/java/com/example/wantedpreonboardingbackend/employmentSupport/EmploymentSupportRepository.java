package com.example.wantedpreonboardingbackend.employmentSupport;

import com.example.wantedpreonboardingbackend.employmentNotice.EmploymentNotice;
import com.example.wantedpreonboardingbackend.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmploymentSupportRepository extends JpaRepository<EmploymentSupport, Long> {
    Optional<EmploymentSupport> findByUserAndEmploymentNotice(User user, EmploymentNotice employmentNotice);
}
