package com.example.wantedpreonboardingbackend.employmentNotice;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEmploymentNotice is a Querydsl query type for EmploymentNotice
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QEmploymentNotice extends EntityPathBase<EmploymentNotice> {

    private static final long serialVersionUID = 1528967534L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEmploymentNotice employmentNotice = new QEmploymentNotice("employmentNotice");

    public final com.example.wantedpreonboardingbackend.company.QCompany company;

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> money = createNumber("money", Integer.class);

    public final StringPath position = createString("position");

    public final StringPath technology = createString("technology");

    public QEmploymentNotice(String variable) {
        this(EmploymentNotice.class, forVariable(variable), INITS);
    }

    public QEmploymentNotice(Path<? extends EmploymentNotice> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEmploymentNotice(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEmploymentNotice(PathMetadata metadata, PathInits inits) {
        this(EmploymentNotice.class, metadata, inits);
    }

    public QEmploymentNotice(Class<? extends EmploymentNotice> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.company = inits.isInitialized("company") ? new com.example.wantedpreonboardingbackend.company.QCompany(forProperty("company")) : null;
    }

}

