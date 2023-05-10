package com.example.pfa.annexes6NaturesMontants;



import com.example.pfa.annexes1.Annexe1;
import com.example.pfa.annexes2.Annexe2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Annexe6NatureMontantRepository extends JpaRepository<Annexe6NatureMontant, Long> {

    List<Annexe6NatureMontant> findByAnnexesId(Long annexesID);

}
