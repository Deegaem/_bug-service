package org.deegaem.bugservice.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDateTime;

@Table
@Data
public class Bug {
    @Id
    @Column
    private Long bug_id;
    @Column
    private String bugTitle;
    @Column
    private String product;
    @Column
    private Long version;
    @Column
    private String component;
    @Column
    private String platform;
    @Column
    private String operatingsystem;
    @Column
    private String status;
    @Column
    private String priority;
    @Column
    private String severity;
    @Column
    private String description;
    @Column
    private String stepsToReproduce;
    @Column
    private String expectedAndActualResult;
    @Column
    private String screenShotUrl;
    @Column
    private Long assignedtoaccount;
    @Column
    private LocalDateTime created;
    @Column
    private LocalDateTime modified;

}
