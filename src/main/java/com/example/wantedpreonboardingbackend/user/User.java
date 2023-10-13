package com.example.wantedpreonboardingbackend.user;

import com.example.wantedpreonboardingbackend.user.dto.userRequsetDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public User(userRequsetDto requestDto) {
        this.name = requestDto.getName();
    }
}
