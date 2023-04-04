package com.example.pfa.annexes1SFm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Annexe1SFmService {
    private final Annexe1SFmRepository annexe1SFmRepository;
    @Autowired
    public Annexe1SFmService(Annexe1SFmRepository annexe1SFmRepository) {
        this.annexe1SFmRepository = annexe1SFmRepository;
    }

    public void addAnnexe1SFm(Annexe1SFm annexe1SFm) {
        annexe1SFmRepository.save(annexe1SFm);
    }

    public List<Annexe1SFm> getAnnexes1SFm() {
        return annexe1SFmRepository.findAll();
    }

    public Annexe1SFm getAnnexe1SFm(Long id) {
        return annexe1SFmRepository.findById(id).get();
    }

    public void deleteAnnexe1SFm(Long id) {
        boolean exist=annexe1SFmRepository.existsById(id);
        if (exist){
            annexe1SFmRepository.deleteById(id);
        }
        else {
            throw new IllegalStateException(
                    "post with id" +id+ "does not exist"
            );
        };
    }

    public Annexe1SFm updateAnnexe1SFm(Long id, Annexe1SFm annexe1SFm) {
        boolean exist = annexe1SFmRepository.existsById(id);
        if (exist){
            //annexe1SFmRepository.save(annexe1SFm);
            Annexe1SFm oldAnnexe1SFm =annexe1SFmRepository.findById(id).get();
            if(annexe1SFm.getSituation() != null) {
                oldAnnexe1SFm.setSituation(annexe1SFm.getSituation());
            }
            return annexe1SFmRepository.save(oldAnnexe1SFm);
        }
        else {
            throw new IllegalStateException(
                    "post with id" +id+ "does not exist"
            );
        }
    }

}
