package com.example.pfa.annexes4;


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

    public Annexe4 getAnnexe4(Long id) {
        return annexe4Repository.findById(id).get();
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

    public Annexe4 updateAnnexe4(Long id, Annexe4 annexe4) {
        boolean exist = annexe4Repository.existsById(id);
        if (exist){


            Annexe4 oldAnnexe4 =annexe4Repository.findById(id).get();

            if(annexe4.getIdCin() != null) {
                oldAnnexe4.setIdCin(annexe4.getIdCin());
            }
            if(annexe4.getName() != null) {
                oldAnnexe4.setName(annexe4.getName());
            }
            if(annexe4.getActivite() != null) {
                oldAnnexe4.setActivite(annexe4.getActivite());
            }
            if(annexe4.getAdresse() != null) {
                oldAnnexe4.setAdresse(annexe4.getAdresse());
            }

            if(annexe4.getHonorairesCom() != null) {
                oldAnnexe4.setHonorairesCom(annexe4.getHonorairesCom());
            }

            if(annexe4.getHonoraires6M() != null) {
                oldAnnexe4.setHonoraires6M(annexe4.getHonoraires6M());
            }
            if(annexe4.getTaux() != null) {
                oldAnnexe4.setTaux(annexe4.getTaux());
            }
            if(annexe4.getPlusValueImm() != null) {
                oldAnnexe4.setPlusValueImm(annexe4.getPlusValueImm());
            }
            if(annexe4.getMtdesrevenues() != null) {
                oldAnnexe4.setMtdesrevenues(annexe4.getMtdesrevenues());
            }
            if(annexe4.getValeurMob() != null) {
                oldAnnexe4.setValeurMob(annexe4.getValeurMob());
            }
            if(annexe4.getRetOpérées() != null) {
                oldAnnexe4.setRetOpérées(annexe4.getRetOpérées());
            }
            if(annexe4.getPlusValueCessi() != null) {
                oldAnnexe4.setPlusValueCessi(annexe4.getPlusValueCessi());
            }

            if(annexe4.getMontantRetenues() != null) {
                oldAnnexe4.setMontantRetenues(annexe4.getMontantRetenues());
            }

            if(annexe4.getMontantnet() != null) {
                oldAnnexe4.setMontantnet(annexe4.getMontantnet());
            }

            return annexe4Repository.save(oldAnnexe4);
        }
        else {
            throw new IllegalStateException(
                    "annexe4 with id" +id+ "does not exist"
            );
        }
    }

}

