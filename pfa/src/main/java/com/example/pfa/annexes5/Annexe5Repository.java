package com.example.pfa.annexes5;


import com.example.pfa.annexes1.Annexe1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Annexe5Repository extends JpaRepository<Annexe5, Long> {
    List<Annexe5> findByClientId(Long clientId);
}