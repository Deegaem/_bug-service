package org.deegaem.bugservice.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import java.util.List;

@Table
@Data
public class Account {
    @Id
    @Column
    private Long id;
    @Column
    private String lname;
    @Column
    private List<Bug> bugs;
}
