package com.leejihoon.task.dto.response;

import lombok.Getter;

@Getter
public class PostResponseDto extends ResponseDto{

    public PostResponseDto(String code, String message) {
        super(code, message);
    }
    
}
