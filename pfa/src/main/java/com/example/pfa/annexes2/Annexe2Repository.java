package com.example.pfa.annexes2;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Annexe2Repository extends JpaRepository<Annexe2, Long> {
    List<Annexe2> findByClientId(Long clientId);

}
