package com.example.tableinheritancetest.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Optional;

@Entity
@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@SuperBuilder(toBuilder = true)
public class JoinedTable2 extends JoinedTable {

	public JoinedTable2() {
		super();
		this.user = this;
	}

	public JoinedTable2(String name, String color) {
		super(name);
		this.user = this;
		this.color = color;
	}


	String color;

	@OneToOne(fetch = FetchType.LAZY
	//		mappedBy = "id"
					 //, cascade = CascadeType.ALL
	)
	@JoinColumn(referencedColumnName = "id")
	//@Builder.Default
	JoinedTable2 user;


	@Override
	public String toString() {
		return "JoinedTable2{" +
				       "id=" + id +
				       ", name='" + name + '\'' +
				       ", color='" + color + '\'' +
				       ", user=" + Optional.ofNullable(user).map(q->q.id).orElse(null) +
				       '}';
	}
}
