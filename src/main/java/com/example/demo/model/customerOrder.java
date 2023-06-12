package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class customerOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private Date dateShipping;
    @ManyToOne(cascade = {CascadeType.ALL})
    private customer customer;
    private String status;
    @ManyToOne(cascade = {CascadeType.ALL})
    private cart cart;
}
