package com.example.project.direction.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

// 고객이 입력한 주소를 입력받을 DTO
@Getter
@AllArgsConstructor
public class InputDto {
    private String address;
}