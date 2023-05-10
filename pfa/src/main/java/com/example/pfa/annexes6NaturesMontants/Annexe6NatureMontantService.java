package com.example.pfa.annexes6NaturesMontants;

import com.example.pfa.annexes1.Annexe1;
import com.example.pfa.annexes2.Annexe2;
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


    public List<Annexe6NatureMontant> findByAnnexesId(Long annexesID) {
        List<Annexe6NatureMontant> aa =  annexe6NatureMontantRepository.findByAnnexesId(annexesID);
        return aa;
    }
}
