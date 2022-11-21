package com.example.be_book.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String code;
    private String author;
    private String publishingCompany;
    private int totalPage;
    private String size;
    private int amount;
    private double price;
    private LocalDate releaseDate;
    private String img;

    private boolean statusDelete = true;
    @ManyToOne
    @JoinColumn(name = "type", referencedColumnName = "id")
    private TypeBook typeBook;
    @OneToMany(mappedBy = "book")
    @JsonIgnore
    private Set<BookBill> bookBill;

}
