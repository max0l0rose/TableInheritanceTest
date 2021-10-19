package com.example.tableinheritancetest.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
//@AllArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class TablePerClass {
	public TablePerClass(String name) {
		this.name = name;
	}

	@GeneratedValue
	@Id
	Long id;

	String name;
}


