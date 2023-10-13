package com.example.wantedpreonboardingbackend.employmentNotice;

import com.example.wantedpreonboardingbackend.common.ApiResponseDto;
import com.example.wantedpreonboardingbackend.employmentNotice.dto.EmploymentNoticeDetailResponseDto;
import com.example.wantedpreonboardingbackend.employmentNotice.dto.EmploymentNoticeRequestDto;
import com.example.wantedpreonboardingbackend.employmentNotice.dto.EmploymentNoticeResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/employment-notice")
public class EmploymentNoticeController {
    private final EmploymentNoticeService employmentNoticeService;

    @PostMapping
    public ResponseEntity<EmploymentNoticeResponseDto> createEmploymentNotice(@RequestBody EmploymentNoticeRequestDto requestDto) {
        EmploymentNoticeResponseDto result = employmentNoticeService.createEmploymentNotice(requestDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @GetMapping("/{employmentNoticeId}")
    public ResponseEntity<EmploymentNoticeDetailResponseDto> getEmploymentNoticeInfo(@PathVariable Long employmentNoticeId) {
        EmploymentNoticeDetailResponseDto result = employmentNoticeService.getEmploymentNoticeInfo(employmentNoticeId);

        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @GetMapping("/all")
    public ResponseEntity<List<EmploymentNoticeResponseDto>> getEmploymentNoticeList(Pageable pageable) {
        List<EmploymentNoticeResponseDto> result = employmentNoticeService.getEmploymentNoticeList(pageable);

        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @GetMapping("/search")
    public ResponseEntity<List<EmploymentNoticeResponseDto>> getSearchEmploymentNoticeList(Pageable pageable, @RequestParam(value = "content", required = false) String content) {
        List<EmploymentNoticeResponseDto> result = employmentNoticeService.getSearchEmploymentNoticeList(pageable, content);

        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @PutMapping("/{employmentNoticeId}")
    public ResponseEntity<EmploymentNoticeResponseDto> updateEmploymentNotice(@PathVariable Long employmentNoticeId,@RequestBody EmploymentNoticeRequestDto requestDto) {
        EmploymentNoticeResponseDto result = employmentNoticeService.updateEmploymentNotice(requestDto, employmentNoticeId);

        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @DeleteMapping("/{employmentNoticeId}")
    public ResponseEntity<ApiResponseDto> deleteEmploymentNotice(@PathVariable Long employmentNoticeId) {
        ApiResponseDto result = employmentNoticeService.deleteEmploymentNotice(employmentNoticeId);

        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
