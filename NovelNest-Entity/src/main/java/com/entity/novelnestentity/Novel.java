package com.entity.novelnestentity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "novel_data")
public class Novel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String novelTitle;
    private String novelStatus;
    private String description;
    private String coverImage;
    private String publisher;

    @OneToMany(mappedBy = "novel", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Author> authors = new HashSet<>();

    @OneToMany(mappedBy = "novel", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Genre> genres = new HashSet<>();

    @OneToMany(mappedBy = "novel", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<AlternativeName> alternativeNames = new HashSet<>();
}
