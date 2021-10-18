package com.example.tableinheritancetest.repo;

import com.example.tableinheritancetest.model.SingleTable2;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SingleTable2Repo extends JpaRepository<SingleTable2, Long> {
}