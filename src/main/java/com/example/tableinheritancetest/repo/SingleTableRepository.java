package com.example.tableinheritancetest.repo;

import com.example.tableinheritancetest.model.SingleTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SingleTableRepository extends JpaRepository<SingleTable, Long> {
}