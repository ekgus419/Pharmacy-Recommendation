package com.example.project.direction.dto;

import lombok.Builder;
import lombok.Getter;

// 고객이 입력한 주소 기준으로 거리 계산 알고리즘을 통해서
// 가까운 약국을 찾고 결과물을 리턴 해줄 DTO
@Getter
@Builder
public class OutputDto {

    private String pharmacyName;    // 약국 명
    private String pharmacyAddress; // 약국 주소
    private String directionUrl;    // 길안내 url
    private String roadViewUrl;     // 로드뷰 url
    private String distance;        // 고객 주소와 약국 주소의 거리
}
