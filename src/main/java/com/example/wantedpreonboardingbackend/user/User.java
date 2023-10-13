package com.example.wantedpreonboardingbackend.user;

import com.example.wantedpreonboardingbackend.user.dto.UserRequsetDto;
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

    public User(UserRequsetDto requestDto) {
        this.name = requestDto.getName();
    }
}
