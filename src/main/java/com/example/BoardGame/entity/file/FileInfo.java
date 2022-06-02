package com.example.BoardGame.entity.file;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="file_info")
@Getter
@Setter

public class FileInfo {
    @Id
    @Column(name = "file_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String url;
}