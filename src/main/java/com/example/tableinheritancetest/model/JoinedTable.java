package com.example.tableinheritancetest.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
//@SuperBuilder(toBuilder = true)
public class JoinedTable {

	public JoinedTable() {
		this.user2 = this;
	}

	public JoinedTable(String name) {
		this();
		this.name = name;
	}

	@GeneratedValue
	@Id
	Long id;

	String name;

	@OneToOne(fetch = FetchType.LAZY
			//		mappedBy = "id"
			//, cascade = CascadeType.ALL
	)
	@JoinColumn(referencedColumnName = "id")
	//@Builder.Default
	JoinedTable user2;

}


