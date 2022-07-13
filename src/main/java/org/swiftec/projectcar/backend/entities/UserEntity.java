package org.swiftec.projectcar.backend.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Table(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String handle;

    private String name;

    private String avatar;

    private String about;

    @OneToMany
    private List<TweetEntity> tweets;

    @OneToMany
    private List<LikedEntity> liked;

}
