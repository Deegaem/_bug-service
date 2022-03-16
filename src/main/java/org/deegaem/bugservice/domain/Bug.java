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
    private String label;
    @Column
    private String description;
    @Column
    private Long assignedtoaccount;
    @Column
    private LocalDateTime created;
    @Column
    private LocalDateTime modified;
}
