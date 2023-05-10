package com.example.pfa.annexes4;


import com.example.pfa.annexes1.Annexe1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Annexe4Service {
    private final Annexe4Repository annexe4Repository;
    @Autowired
    public Annexe4Service(Annexe4Repository annexe4Repository) {
        this.annexe4Repository = annexe4Repository;
    }


    public Annexe4 addAnnexe4(Annexe4 annexe4) {
        return annexe4Repository.save(annexe4);
    }

    public List<Annexe4> getAnnexes4() {
        return annexe4Repository.findAll();
    }


    public void deleteAnnexe4(Long id) {
        boolean exist = annexe4Repository.existsById(id);
        if (exist) {
            annexe4Repository.deleteById(id);
        } else {
            throw new IllegalStateException(
                    "annexe4 with id" + id + "does not exist"
            );
        };
    }


    public List<Annexe4> findByClientId(Long clientId) {
        List<Annexe4> aa =  annexe4Repository.findByClientId(clientId);
        return aa;
    }

}

