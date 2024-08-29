package com.admin.novelnestadmin.entity;

import com.admin.novelnestadmin.entity.sub.AlternativaName;
import com.admin.novelnestadmin.entity.sub.Author;
import com.admin.novelnestadmin.entity.sub.Genre;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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
    private Set<Author> authors;

    @OneToMany(mappedBy = "novel", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Genre> genres;

    @OneToMany(mappedBy = "novel", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<AlternativaName> alternativaNames;
}
