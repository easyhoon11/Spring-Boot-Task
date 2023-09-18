package com.leejihoon.task.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PatchRequestBodyDto extends PostRequestBodyDto {
    private String taskNumber;
}
