package com.entity.novelnestentity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    @ManyToOne
    @JoinColumn(name = "novel_id")
    private Novel novel;
}
