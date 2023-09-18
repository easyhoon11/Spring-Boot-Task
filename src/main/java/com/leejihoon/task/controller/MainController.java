package com.leejihoon.task.controller;

import javax.validation.Valid;

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

@RestController
@RequestMapping("/api/v1")
public class MainController {

    @GetMapping("task/{taskNumber}")
    public String getSchedule(@PathVariable("taskNumber")String taskNumber){
        return "일정 불러오기";
    }

    @PostMapping("task")
    public String postSchedule(@Valid @RequestBody PostRequestBodyDto postBodyDto){
        return "일정 작성하기 " + "일정이름: " + postBodyDto.getScheduleName() + "카테고리: " + postBodyDto.getCategory() + "설명: " + postBodyDto.getDescription() + "날짜: " + postBodyDto.getDate() + "시간: " + postBodyDto.getTime();
    }

    @PatchMapping("task/{taskNumber}")
    public String patchSchedule(@Valid @RequestBody PatchRequestBodyDto patchBodyDto){
        return "일정 수정하기" + "일정번호: " + patchBodyDto.getTaskNumber() + "일정이름: " + patchBodyDto.getScheduleName() + "카테고리: " + patchBodyDto.getCategory() + "설명: " + patchBodyDto.getDescription() + "날짜: " + patchBodyDto.getDate() + "시간: " + patchBodyDto.getTime();
    }

    @DeleteMapping("task/{taskNumber}")
    public String deleteSchedule(){
        return "일정 삭제하기";
    }
}



