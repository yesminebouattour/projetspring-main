package com.example.pfa.annexes6;

import com.example.pfa.annexes1.Annexe1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Annexe6Repository extends JpaRepository<Annexe6, Long> {
    List<Annexe6> findByClientId(Long clientId);
}
