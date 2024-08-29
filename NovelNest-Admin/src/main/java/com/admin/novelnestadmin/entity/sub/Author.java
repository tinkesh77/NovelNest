package com.admin.novelnestadmin.entity.sub;

import com.admin.novelnestadmin.entity.Novel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Corrected field name

    private String name;

    @ManyToOne
    @JoinColumn(name = "novel_id")
    private Novel novel;
}
