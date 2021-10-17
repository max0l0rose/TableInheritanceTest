package com.example.tableinheritancetest.model;

import lombok.*;

import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Table2 extends SingleTable {

//	public Table2(String color) {
//		this.color = color;
//	}

	String color;
}
