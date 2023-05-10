package com.example.pfa.annexes1;
import com.example.pfa.clients.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Annexe1Repository extends JpaRepository<Annexe1, Long> {
    List<Annexe1> findByClientId(Long clientId);
}
