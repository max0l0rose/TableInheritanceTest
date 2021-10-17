package com.example.tableinheritancetest;

import com.example.tableinheritancetest.model.Table2;
import com.example.tableinheritancetest.repo.Table2Repository;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class Main {

	private static final Logger log = LoggerFactory.getLogger(Main.class);

//	@Builder
//	class A {
//		int val1;
//		int val2;
//	}

	@Bean
	@Transactional(
			//propagation = Propagation.REQUIRED,
			//isolation = Isolation.READ_UNCOMMITTED
	)
	public boolean demo1(Table2Repository table2Repository
	                     //, EntityManager entityManager
	) {
		//return (args) ->
		//{
		log.info("demo1: ");

	//	A a = A.builder().val1(1).val1(2).build();

		table2Repository.save(Table2.builder().color("r").build(););
		table2Repository.save(new Table2("qqq2"));

		log.info("demo1: Ok");
		return true;
	}


	public static void main(String[] args) {
		log.info("main: ----------------------------");
		SpringApplication.run(Main.class, args);
		log.info("main: ===========================!");
	}

}
