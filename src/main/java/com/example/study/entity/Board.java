package com.example.study.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "board")
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    private String content;

    private String filename;

    private String filepath;
}
