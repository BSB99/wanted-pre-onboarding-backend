package com.example.wantedpreonboardingbackend.employment;

import com.example.wantedpreonboardingbackend.employment.EmploymentNoticeQuery;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import lombok.RequiredArgsConstructor;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.domain.Pageable;

import java.util.List;

@RequiredArgsConstructor
public class EmploymentNoticeQueryImpl implements EmploymentNoticeQuery {
    private final JPAQueryFactory jpaQueryFactory;
    private final QEmploymentNotice employmentNotice =QEmploymentNotice.employmentNotice;

    public List<EmploymentNotice> searchEmploymentNoticeList(Pageable pageable, String content) {
        Predicate predicate =
                employmentNotice.company.name.containsIgnoreCase(content)
                        .or(employmentNotice.company.region.like("%" + content + "%"))
                        .or(employmentNotice.company.country.like("%" + content + "%"))
                        .or(employmentNotice.position.like("%" + content + "%"))
                        .or(employmentNotice.technology.like("%" + content + "%"));

        return jpaQueryFactory.selectFrom(employmentNotice)
                .where(predicate)
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();
    }
}
