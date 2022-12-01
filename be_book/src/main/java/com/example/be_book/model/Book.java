package com.example.be_book.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "varchar(200)")
    private String title;

    private String publisher;

    private Integer totalPages;

    private Double width;

    private String author;

    private Double height;

    private Double price;

    @Column(columnDefinition = "text")
    private String imageUrl;

    @Column(columnDefinition = "text")
    private String summary;

    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category categories;

}
