package com.example.tableinheritancetest.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.util.Optional;

@Entity
@Data
//@AllArgsConstructor
@NoArgsConstructor
//@SuperBuilder(toBuilder = true)
public class TablePerClass2 extends TablePerClass {

	public TablePerClass2(String name, String color) {
		super(name);
		this.color = color;
	}

	String color;
}
