package com.leejihoon.task.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leejihoon.task.dto.request.PatchRequestBodyDto;
import com.leejihoon.task.dto.request.PostRequestBodyDto;
import com.leejihoon.task.dto.response.GetResponseDto;
import com.leejihoon.task.dto.response.PostResponseDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class MainController {

    public final PostResponseDto responseDto;

    @GetMapping("task/{taskNumber}")
    public ResponseEntity<GetResponseDto>(@PathVariable("taskNumber") Integer taskNumber) {
        return null;
    }

    @PostMapping("task")
    public String postSchedule(@Valid @RequestBody PostRequestBodyDto postBodyDto) {
        return null;
    }

    @PatchMapping("task/{taskNumber}")
    public String patchSchedule(@Valid @RequestBody @PathVariable("taskNumber") Integer taskNumber,
            PatchRequestBodyDto patchBodyDto) {
        return null;
    }

    @DeleteMapping("task/{taskNumber}")
    public String deleteSchedule(@PathVariable("taskNumber") Integer taskNumber) {
        return null;
    }
}
