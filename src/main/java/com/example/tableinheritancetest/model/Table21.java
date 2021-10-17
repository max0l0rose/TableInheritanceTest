package com.example.tableinheritancetest.model;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Table21 extends SingleTable {

	int height;
}
