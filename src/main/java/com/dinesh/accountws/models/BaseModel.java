package com.dinesh.accountws.models;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
@MappedSuperclass
public class BaseModel {
    @Column(updatable = false)
    private Timestamp createdAt;
    @Column(insertable = false)
    private Timestamp updatedAt;
    @Column(updatable = false)
    private String createdBy;
    @Column(insertable = false)
    private String updatedBy;
}
