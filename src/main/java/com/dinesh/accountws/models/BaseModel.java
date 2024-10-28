package com.dinesh.accountws.models;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@MappedSuperclass
public class BaseModel {
//    @Column(updatable = false)
    private LocalDateTime createdAt;
//    @Column(insertable = false)
    private LocalDateTime updatedAt;
//    @Column(updatable = false)
    private String createdBy;
//    @Column(insertable = false)
    private String updatedBy;
}
