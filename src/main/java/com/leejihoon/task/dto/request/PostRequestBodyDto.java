package com.leejihoon.task.dto.request;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import javax.validation.constraints.NotBlank;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PostRequestBodyDto {
    
    @NotBlank
    private String scheduleName;
    @NotBlank
    private String category;
    @NotBlank
    private String description;
    @NotBlank
    private String date;
    @NotBlank
    private String time;
}
