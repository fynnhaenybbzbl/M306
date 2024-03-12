package com.m306.tablesession.repository.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Validated
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name="customer_id_seq",
            sequenceName="customer_id_seq",
            allocationSize=100)
    private Long id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private Date birthdate;
    private String street;
    @Column(name = "street_number", nullable = false)
    private String streetNumber;
    private String city;
    private String zip;
}
