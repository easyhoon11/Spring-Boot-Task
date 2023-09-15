package com.leejihoon.task.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leejihoon.task.dto.request.PostRequestBodyDto;

@RestController
@RequestMapping("/api/v1")
public class MainController {

    @GetMapping("task/{taskNumber}")
    public String getSchedule(@PathVariable("taskNumber")String taskNumber){
        return "일정 불러오기";
    }

    @PostMapping("task")
    public String postSchedule(@RequestBody PostRequestBodyDto bodyDto){
        return "일정 작성하기" + bodyDto.getScheduleName() + bodyDto.getCategory() + bodyDto.getDescription() + bodyDto.getDate() + bodyDto.getTime();
    }

    @PatchMapping("task/{taskNumber}")
    public String patchSchedule(@RequestBody PostRequestBodyDto bodyDto){
         return "일정 수정하기" + bodyDto.getScheduleName() + bodyDto.getCategory() + bodyDto.getDescription() + bodyDto.getDate() + bodyDto.getTime();
    }

    @DeleteMapping("task/{taskNumber}")
    public String deleteSchedule(){
        return "삭제합니다.";
    }
}



// 5. Task 컨트롤러에 
// 일정 불러오기 (GET 프로토콜://호스트:포트/api/v1/task/{taskNumber}), 
// 일정 작성하기 (POST 프로토콜://호스트:포트/api/v1/task), 
// 일정 수정하기 (PATCH 프로토콜://호스트:포트/api/v1/task/{taskNumber}), 
// 일정 삭제하기 (DELETE 프로토콜://호스트:포트/api/v1/task/{taskNumber}) 메서드를 작성한다.

// 5 - 1. 일정 작성하기 요청에서는 데이터를 '일정이름', '카테고리', '설명', '날짜', '시간'을 입력받는다. (모두 문자열)
// 5 - 2. 일정 수정하기 요청에서는 데이터를 '일정이름', '카테고리', '설명', '날짜', '시간'을 입력받는다. (모두 문자열)