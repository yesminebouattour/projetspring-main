package com.example.pfa.annexes6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Annexe6Service {
    private final Annexe6Repository annexe6Repository;
    @Autowired
    public Annexe6Service(Annexe6Repository annexe6Repository) {
        this.annexe6Repository = annexe6Repository;
    }


    public Annexe6 addAnnexe6(Annexe6 annexe6) {
        return annexe6Repository.save(annexe6);
    }

    public List<Annexe6> getAnnexes6() {
        return annexe6Repository.findAll();
    }

    public Annexe6 getAnnexe6(Long id) {
        return annexe6Repository.findById(id).get();
    }

    public void deleteAnnexe6(Long id) {
        boolean exist = annexe6Repository.existsById(id);
        if (exist) {
            annexe6Repository.deleteById(id);
        } else {
            throw new IllegalStateException(
                    "annexe1 with id" + id + "does not exist"
            );
        };
    }
}

