package com.example.project.direction.controller;

import com.example.project.direction.entity.Direction;
import com.example.project.direction.service.DirectionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.util.UriComponentsBuilder;

@Controller
@Slf4j
@RequiredArgsConstructor
public class DirectionController {

    private final DirectionService directionService;

    @GetMapping("/dir/{encodedId}")
    public String searchDirection(@PathVariable("encodedId") String encodedId) {
        // 고객에게 shortened url 로 제공 -> 고객은 shortened url 클릭
        // searchDirection() 은 요청을 처리
        // -> 고객이 제공한 shortened url 을 클릭 하는 순간 그 요청을 받아온다.
        String result = directionService.findDirectionUrlById(encodedId);
        log.info("DirectionController searchDirection: direction url: {}" , result);
        return "redirect:"+result;
    }
}