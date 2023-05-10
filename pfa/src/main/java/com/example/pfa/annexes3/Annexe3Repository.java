package com.example.pfa.annexes3;


import com.example.pfa.annexes1.Annexe1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Annexe3Repository extends JpaRepository<Annexe3, Long> {
    List<Annexe3> findByClientId(Long clientId);

}
