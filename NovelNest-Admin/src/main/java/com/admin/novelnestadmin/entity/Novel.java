package com.admin.novelnestadmin.entity;

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
    private String novelAuthor;
    private String novelGenra;
    private String novelStatus;
    private String alternativaName;
    private String decrption;
    private String coverImage;
    private String publisher;

    @OneToMany(mappedBy = "novel")
    private Set<Chapter> chapters;
}
