package com.example.wantedpreonboardingbackend.employmentSupport;

import com.example.wantedpreonboardingbackend.employmentNotice.EmploymentNotice;
import com.example.wantedpreonboardingbackend.user.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "employment_supports")
public class EmploymentSupport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employment_notice_id")
    private EmploymentNotice employmentNotice;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public EmploymentSupport(EmploymentNotice employmentNotice, User user) {
        this.employmentNotice = employmentNotice;
        this.user = user;
    }
}
