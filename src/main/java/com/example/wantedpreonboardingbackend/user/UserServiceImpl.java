package com.example.wantedpreonboardingbackend.user;

import com.example.wantedpreonboardingbackend.common.ApiResponseDto;
import com.example.wantedpreonboardingbackend.user.dto.UserRequsetDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    public ApiResponseDto createUser(UserRequsetDto requestDto) {
        User user = new User(requestDto);

        userRepository.save(user);

        return new ApiResponseDto("회원 생성", 201);
    }
}
