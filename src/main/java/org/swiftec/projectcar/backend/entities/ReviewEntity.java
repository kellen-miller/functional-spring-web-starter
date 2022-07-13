package org.swiftec.projectcar.backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "review")
public class ReviewEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String content;
    private int rating;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(referencedColumnName = "id")
//    private AuthorEntity authorEntity;
}
