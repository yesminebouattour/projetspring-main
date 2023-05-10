package com.example.pfa.annexes2;


import com.example.pfa.annexes1.Annexe1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Annexe2Service {
    private final Annexe2Repository annexe2Repository;
    @Autowired
    public Annexe2Service(Annexe2Repository annexe2Repository) {
        this.annexe2Repository = annexe2Repository;
    }


    public Annexe2 addAnnexe2(Annexe2 annexe2) {
        return annexe2Repository.save(annexe2);
    }

    public List<Annexe2> getAnnexes2() {
        return annexe2Repository.findAll();
    }



    public void deleteAnnexe2(Long id) {
        boolean exist = annexe2Repository.existsById(id);
        if (exist) {
            annexe2Repository.deleteById(id);
        } else {
            throw new IllegalStateException(
                    "annexe1 with id" + id + "does not exist"
            );
        };
    }


    public List<Annexe2> findByClientId(Long clientId) {
        List<Annexe2> aa =  annexe2Repository.findByClientId(clientId);
        return aa;
    }
}
