package com.example.tableinheritancetest.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

@DiscriminatorValue("1")
public class SingleTable2 extends SingleTable {

//	public Table2(String color) {
//		this.color = color;
//	}

	String color;
}
