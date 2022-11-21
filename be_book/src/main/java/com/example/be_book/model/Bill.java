package com.example.be_book.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private boolean cart;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private AppUser user;
    @OneToMany(mappedBy = "id")
    @JsonIgnore
    private Set<BookBill> bookBills;
    @OneToOne
    @JoinColumn(name = "bill_detail_id", referencedColumnName = "id")
    private BillDetail billDetail;
}
