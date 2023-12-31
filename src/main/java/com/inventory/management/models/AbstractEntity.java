package com.inventory.management.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
@Data
@SuperBuilder
@NoArgsConstructor
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id ;
    @CreatedDate
    @Column(
            nullable = false,
            updatable = false
    )
    private LocalDateTime createdDate;
    @LastModifiedDate
    @Column(
            nullable = false,
            updatable = false
    )
    private LocalDateTime lastModifiedDate ;
}
