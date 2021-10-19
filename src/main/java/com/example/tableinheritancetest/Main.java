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
	                     JoinedTable21Repository joinedTable21Repository,
						 TablePerClassRepository tablePerClassRepository,
						 TablePerClass2Repository tablePerClass2Repository
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

//		JoinedTable jt = new JoinedTable("aaaa");
//		joinedTableRepository.save(jt);
//		joinedTableRepository.save(new JoinedTable("aaa2"));

		tablePerClassRepository.save(new TablePerClass("mmm"));
		tablePerClassRepository.save(new TablePerClass("mmm2"));

		tablePerClass2Repository.save(new TablePerClass2("nnnnn", "r" ));
		tablePerClass2Repository.save(new TablePerClass2("nnnnn222", "g"));

		///JoinedTable2 table = new JoinedTable2().toBuilder().name("zzz").color("r").build();
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

		JoinedTable2 t2a = new JoinedTable2("bbbb", "r");
		joinedTable2Repository.save(t2a);
		joinedTable2Repository.save(new JoinedTable2("bbbb2", "g"));

		log.info("demo2: Ok");
		return true;
	}



	@Bean
	@Transactional(
			//propagation = Propagation.REQUIRED,
			//isolation = Isolation.READ_UNCOMMITTED
	)
	public boolean demo3(SingleTableRepository singleTableRepo,
	                     SingleTable2Repo singleTable2Repo,
	                     SingleTable21Repo singleTable21Repo,
	                     JoinedTableRepository joinedTableRepository,
	                     JoinedTable2Repository joinedTable2Repository,
	                     JoinedTable21Repository joinedTable21Repository
	                     //, EntityManager entityManager
	) {
		//return (args) ->
		//{
		log.info("demo3: ");

		//joinedTable21Repository.save(JoinedTable21.builder().height(100).name("ccc2").build());

		JoinedTable joinedTable = joinedTableRepository.findById(1L).get();

		JoinedTable2 joinedTable2 = joinedTable2Repository.findById(3L).get();

		log.info("demo3: Ok");
		return true;
	}


	public static void main(String[] args) {
		log.info("main: ----------------------------");
		SpringApplication.run(Main.class, args);
		log.info("main: ===========================!");
	}

}
