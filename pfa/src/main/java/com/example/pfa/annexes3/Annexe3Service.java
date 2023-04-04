package com.example.pfa.annexes3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Annexe3Service {
    private final Annexe3Repository annexe3Repository;
    @Autowired
    public Annexe3Service(Annexe3Repository annexe3Repository) {
        this.annexe3Repository = annexe3Repository;
    }

    public Annexe3 addAnnexe3(Annexe3 annexe3) {
        return annexe3Repository.save(annexe3);
    }

    public List<Annexe3> getAnnexes3() {
        return annexe3Repository.findAll();
    }

    public Annexe3 getAnnexe3(Long id) {
        return annexe3Repository.findById(id).get();
    }

    public void deleteAnnexe3(Long id) {
        boolean exist = annexe3Repository.existsById(id);
        if (exist) {
            annexe3Repository.deleteById(id);
        } else {
            throw new IllegalStateException(
                    "annexe1 with id" + id + "does not exist"
            );
        };
    }
}

