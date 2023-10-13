package com.example.wantedpreonboardingbackend.user;

import com.example.wantedpreonboardingbackend.common.ApiResponseDto;
import com.example.wantedpreonboardingbackend.user.dto.UserRequsetDto;

public interface UserService {
    ApiResponseDto createUser(UserRequsetDto requestDto);
}
