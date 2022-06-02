package com.example.BoardGame.entity;

import com.example.BoardGame.entity.file.FileInfo;
import lombok.Getter;
import lombok.Setter;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.*;

@Entity
@Table(name = "board")
@Getter
@Setter
public class Board {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 200)
    private String name;

    @Column(nullable = false, length = 200)
    private String distributor;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private int min_person;

    @Column(nullable = false)
    private int max_person;

    @Column(nullable = false)
    private int recommend_person;

    @Column(nullable = false)
    private int recommend_age;

    @Column(nullable = false)
    private float level;

    @Column(nullable = false)
    private float play_time;

    @Column(nullable = false)
    private int play_max_time;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, columnDefinition = "enum('ALL', 'FEMALE','MAEL')")
    private Sex sex;

    @Column
    private String ment;

    @Column(nullable = false)
    private int explain_time;
    @Column
    private String description;

    @Column( length = 200)
    private String media_url;

    @Column
    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<FileInfo> fileInfo;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private Date createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
enum Sex{
    ALL,
    FEMALE,
    MALE
}
