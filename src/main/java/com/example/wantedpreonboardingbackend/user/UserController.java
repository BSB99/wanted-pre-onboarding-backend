package com.example.wantedpreonboardingbackend.user;

import com.example.wantedpreonboardingbackend.common.ApiResponseDto;
import com.example.wantedpreonboardingbackend.user.dto.UserRequsetDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;

    @PostMapping
    private ResponseEntity<ApiResponseDto> createUser(@RequestBody UserRequsetDto requestDto) {
        ApiResponseDto result = userService.createUser(requestDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }
}
