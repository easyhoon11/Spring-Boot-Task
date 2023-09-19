package com.leejihoon.task.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GetResponseDto {
    private String code;
    private String message;
    private Integer taskNumber;
    private String scheduleName;
    private String category;
    private String description;
    private String date;
    private String time;
}
