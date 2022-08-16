package com.org.tav.day8;

import javax.persistence.*;

@Entity  
@Table(name = "employee")  
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)  
  
public class Employee {  
@Id  
@GeneratedValue(strategy=GenerationType.AUTO) 

      
@Column(name = "id")  
private int id;  
  

@Column(name = "name")  
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}  
  
//setters and getters  
}  