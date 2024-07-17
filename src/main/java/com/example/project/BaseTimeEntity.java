package com.example.project;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass // 엔티티의 공통 매핑 정보
@EntityListeners(AuditingEntityListener.class) // 해당 클래스에 auditing 기능을 포함
public class BaseTimeEntity {

    @CreatedDate // 엔티티가 생성되어 저장될 때 시간이 자동 저장
    @Column(updatable = false)
    private LocalDateTime createdDate;

    @LastModifiedDate // 엔티티 값을 변경할 때 시간이 Update
    private LocalDateTime modifiedDate;

}
