package org.swiftec.projectcar.backend.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
@Table(name = "tweet")
public class TweetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String url;

    private ZonedDateTime posted;

    private String content;

    private int likes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "id")
    private UserEntity user;
}
