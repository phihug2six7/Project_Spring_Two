package com.example.be_book.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private String username;
    private String email;
    private String password;
    private String name;
    private LocalDate birthDay;

    @OneToMany(mappedBy = "appRole")
    private List<UserRole> userRoles;
    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Bill> bills;
}
