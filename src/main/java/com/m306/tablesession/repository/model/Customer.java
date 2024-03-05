package com.m306.tablesession.repository.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Validated
public class Customer {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private Date birthdate;
    private String street;
    private String streetNumber;
    private String city;
    private String zip;
}
