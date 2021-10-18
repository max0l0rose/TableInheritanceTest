package com.example.tableinheritancetest.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
		discriminatorType = DiscriminatorType.STRING,
		name = "topic_type_id",
		length = 1
		//columnDefinition = "TINYINT(10)"
		//columnDefinition = "VARCHAR(7)"
)
@DiscriminatorValue("0")
public class SingleTable {

	@GeneratedValue
	@Id
	Long Id;

	String name;
}


