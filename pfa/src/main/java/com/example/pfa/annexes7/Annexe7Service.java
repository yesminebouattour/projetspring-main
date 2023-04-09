package com.example.pfa.annexes7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Annexe7Service {

    private final Annexe7Repository annexe7Repository;
    @Autowired
    public Annexe7Service(Annexe7Repository annexe7Repository) {
        this.annexe7Repository = annexe7Repository;
    }


    public Annexe7 addAnnexe7(Annexe7 annexe7) {
        return annexe7Repository.save(annexe7);
    }

    public List<Annexe7> getAnnexes7() {
        return annexe7Repository.findAll();
    }

    public Annexe7 getAnnexe7(Long id) {
        return annexe7Repository.findById(id).get();
    }

    public void deleteAnnexe7(Long id) {
        boolean exist = annexe7Repository.existsById(id);
        if (exist) {
            annexe7Repository.deleteById(id);
        } else {
            throw new IllegalStateException(
                    "annexe1 with id" + id + "does not exist"
            );
        };

    }
}
