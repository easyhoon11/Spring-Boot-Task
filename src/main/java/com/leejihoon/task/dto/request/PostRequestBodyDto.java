package com.leejihoon.task.dto.request;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import javax.validation.constraints.NotEmpty;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PostRequestBodyDto {
    
    @NotEmpty
    private String scheduleName;
    @NotEmpty
    private String category;
    @NotEmpty
    private String description;
    @NotEmpty
    private String date;
    @NotEmpty
    private String time;
}
