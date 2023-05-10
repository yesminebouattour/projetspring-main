package com.example.pfa.annexes7;



import com.example.pfa.annexes1.Annexe1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Annexe7Repository extends JpaRepository<Annexe7, Long> {
    List<Annexe7> findByClientId(Long clientId);
}
