package com.example.pfa.annexes6NaturesMontants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Annexe6NatureMontantService {

    private final Annexe6NatureMontantRepository annexe6NatureMontantRepository;
    @Autowired
    public Annexe6NatureMontantService(Annexe6NatureMontantRepository annexe6NatureMontantRepository) {
        this.annexe6NatureMontantRepository = annexe6NatureMontantRepository;
    }


    public void addNatureMontatnt(Annexe6NatureMontant natureMontant) {
        annexe6NatureMontantRepository.save(natureMontant);
    }

    public List<Annexe6NatureMontant> getNaturesMontants() {
        return annexe6NatureMontantRepository.findAll();
    }

    public Annexe6NatureMontant getNatureMontant(Long id) {
        return annexe6NatureMontantRepository.findById(id).get();
    }

    public void deleteNatureMontant(Long id) {
        boolean exist= annexe6NatureMontantRepository.existsById(id);
        if (exist){
            annexe6NatureMontantRepository.deleteById(id);
        }
        else {
            throw new IllegalStateException(
                    "post with id" +id+ "does not exist"
            );
        };
    }

    public Annexe6NatureMontant updateNatureMontant(Long id, Annexe6NatureMontant natureMontant) {
        boolean exist = annexe6NatureMontantRepository.existsById(id);
        if (exist){

            Annexe6NatureMontant oldNatureMontant = annexe6NatureMontantRepository.findById(id).get();
            if(natureMontant.getNatureMontant() != null) {
                oldNatureMontant.setNatureMontant(natureMontant.getNatureMontant());
            }
            if(natureMontant.getAnnexe() != null) {
                oldNatureMontant.setAnnexe(natureMontant.getAnnexe());
            }
            return annexe6NatureMontantRepository.save(oldNatureMontant);
        }
        else {
            throw new IllegalStateException(
                    "post with id" +id+ "does not exist"
            );
        }
    }

}

