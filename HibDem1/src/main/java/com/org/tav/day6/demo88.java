package com.org.tav.day6;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class demo88 {
   @Id
   private int id;
   @Column(name="name")
   private String name;
}