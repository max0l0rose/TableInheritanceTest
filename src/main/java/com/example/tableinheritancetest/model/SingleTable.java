package com.example.tableinheritancetest.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
		discriminatorType = DiscriminatorType.INTEGER,
		name = "topic_type_id"
		//columnDefinition = "TINYINT(1)"
)
public class SingleTable {

	@GeneratedValue
	@Id
	Long Id;

	String name;
}


