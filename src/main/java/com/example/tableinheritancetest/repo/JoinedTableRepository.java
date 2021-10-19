package com.example.tableinheritancetest.repo;

import com.example.tableinheritancetest.model.JoinedTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JoinedTableRepository extends JpaRepository<JoinedTable, Long> {
}