package com.example.pfa.annexes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface AnnexesRepository extends JpaRepository<Annexes, Long> {
}
