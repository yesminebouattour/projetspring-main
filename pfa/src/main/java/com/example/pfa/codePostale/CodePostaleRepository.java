package com.example.pfa.codePostale;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodePostaleRepository extends JpaRepository<CodePostale, Long> {
}
