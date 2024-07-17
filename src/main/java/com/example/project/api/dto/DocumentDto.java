package com.example.project.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

// 카카오 api 에서 리턴 받은 결과 값 중 필요한 데이터만 추출
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DocumentDto {

    @JsonProperty("place_name")
    private String placeName; // 약국명

    @JsonProperty("address_name")
    private String addressName; // 주소

    @JsonProperty("y")
    private double latitude; // 위도

    @JsonProperty("x")
    private double longitude; // 경도

    @JsonProperty("distance")
    private double distance; // 카카오에서 위도,경도 계산하여 가까운 약국을 찾아줌
}
