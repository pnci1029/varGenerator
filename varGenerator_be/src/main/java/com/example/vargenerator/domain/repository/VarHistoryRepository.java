package com.example.vargenerator.domain.repository;

import com.example.vargenerator.domain.model.VarHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VarHistoryRepository extends JpaRepository<VarHistory, Long> {
}
