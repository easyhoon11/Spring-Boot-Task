package com.leejihoon.task.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PostRequestBodyDto {
    private String scheduleName;
    private String category;
    private String description;
    private String date;
    private String time;
}
