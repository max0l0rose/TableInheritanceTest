package com.example.tableinheritancetest;

import com.example.tableinheritancetest.model.*;
import com.example.tableinheritancetest.repo.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class Main {

	private static final Logger log = LoggerFactory.getLogger(Main.class);

	@Bean
	@Transactional(
			//propagation = Propagation.REQUIRED,
			//isolation = Isolation.READ_UNCOMMITTED
	)
	public boolean demo1(SingleTableRepository singleTableRepo,
	                     SingleTable2Repo singleTable2Repo,
	                     SingleTable21Repo singleTable21Repo,
	                     JoinedTableRepository joinedTableRepository,
	                     JoinedTable2Repository joinedTable2Repository,
	                     JoinedTable21Repository joinedTable21Repository
	                     //, EntityManager entityManager
	) {
		//return (args) ->
		//{
		log.info("demo1: ");

//		singleTableRepo.save(SingleTable.builder().name("nnn").build());
//		singleTable2Repo.save(SingleTable2.builder().color("r").name("nnn").build());
//		singleTable2Repo.save(new SingleTable2("qqq2"));
//		singleTable21Repo.save(SingleTable21.builder().height(100).name("qqq21").build());
//		singleTable21Repo.save(SingleTable21.builder().height(110).name("qqq212").build());

		joinedTableRepository.save(JoinedTable.builder().name("aaa").build());
		joinedTableRepository.save(JoinedTable.builder().name("aaa2").build());

		joinedTable2Repository.save(JoinedTable2.builder().name("bbbb").color("r").build());
		joinedTable2Repository.save(JoinedTable2.builder().name("bbbb2").color("g").build());

		joinedTable21Repository.save(JoinedTable21.builder().height(100).name("ccc2").build());

		log.info("demo1: Ok");
		return true;
	}


	@Bean
	@Transactional(
			//propagation = Propagation.REQUIRED,
			//isolation = Isolation.READ_UNCOMMITTED
	)
	public boolean demo2(SingleTableRepository singleTableRepo,
	                     SingleTable2Repo singleTable2Repo,
	                     SingleTable21Repo singleTable21Repo,
	                     JoinedTableRepository joinedTableRepository,
	                     JoinedTable2Repository joinedTable2Repository,
	                     JoinedTable21Repository joinedTable21Repository
	                     //, EntityManager entityManager
	) {
		//return (args) ->
		//{
		log.info("demo2: ");

		JoinedTable joinedTable = joinedTableRepository.findById(1L).get();

		log.info("demo2: Ok");
		return true;
	}

	public static void main(String[] args) {
		log.info("main: ----------------------------");
		SpringApplication.run(Main.class, args);
		log.info("main: ===========================!");
	}

}
