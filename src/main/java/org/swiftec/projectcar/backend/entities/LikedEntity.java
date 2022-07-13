package org.swiftec.projectcar.backend.entities;

import jakarta.persistence.*;

public class LikedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(referencedColumnName = "id")
    private TweetEntity tweet;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "id")
    private UserEntity user;
}
