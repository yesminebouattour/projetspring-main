package com.example.pfa.annexes5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Annexe5Service {
    private final Annexe5Repository annexe5Repository;
    @Autowired
    public Annexe5Service(Annexe5Repository annexe5Repository) {
        this.annexe5Repository = annexe5Repository;
    }

    public Annexe5 addAnnexe5(Annexe5 annexe5) {
        return annexe5Repository.save(annexe5);
    }

    public List<Annexe5> getAnnexes5() {
        return annexe5Repository.findAll();
    }

    public Annexe5 getAnnexe5(Long id) {
        return annexe5Repository.findById(id).get();
    }

    public void deleteAnnexe5(Long id) {
        boolean exist = annexe5Repository.existsById(id);
        if (exist) {
            annexe5Repository.deleteById(id);
        } else {
            throw new IllegalStateException(
                    "annexe5 with id" + id + "does not exist"
            );
        };
    }
}

