package com.example.pfa.annexes4;


import com.example.pfa.annexes1.Annexe1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Annexe4Repository extends JpaRepository<Annexe4, Long> {
    List<Annexe4> findByClientId(Long clientId);
}
