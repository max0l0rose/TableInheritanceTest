package com.example.tableinheritancetest.repo;

import com.example.tableinheritancetest.model.TablePerClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TablePerClassRepository extends JpaRepository<TablePerClass, Long> {
}