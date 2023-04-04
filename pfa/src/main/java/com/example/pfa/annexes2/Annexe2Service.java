package com.example.pfa.annexes2;


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

    public Annexe2 getAnnexe2(Long id) {
        return annexe2Repository.findById(id).get();
    }

    public void deleteAnnexe2(Long id) {
        boolean exist = annexe2Repository.existsById(id);
        if (exist) {
            annexe2Repository.deleteById(id);
        } else {
            throw new IllegalStateException(
                    "annexe2 with id" + id + "does not exist"
            );
        };
    }

    public Annexe2 updateAnnexe2(Long id, Annexe2 annexe2) {
        boolean exist = annexe2Repository.existsById(id);
        if (exist){


            Annexe2 oldAnnexe2 =annexe2Repository.findById(id).get();

            if(annexe2.getIdCin() != null) {
                oldAnnexe2.setIdCin(annexe2.getIdCin());
            }
            if(annexe2.getName() != null) {
                oldAnnexe2.setName(annexe2.getName());
            }
            if(annexe2.getActivite() != null) {
                oldAnnexe2.setActivite(annexe2.getActivite());
            }
            if(annexe2.getAdresse() != null) {
                oldAnnexe2.setAdresse(annexe2.getAdresse());
            }
            if(annexe2.getMontant() != null) {
                oldAnnexe2.setMontant(annexe2.getMontant());
            }
            if(annexe2.getHonorairesServis() != null) {
                oldAnnexe2.setHonorairesServis(annexe2.getHonorairesServis());
            }
            if(annexe2.getRemuEtPrimes() != null) {
                oldAnnexe2.setRemuEtPrimes(annexe2.getRemuEtPrimes());
            }
            if(annexe2.getRemunerationPaye() != null) {
                oldAnnexe2.setRemunerationPaye(annexe2.getRemunerationPaye());
            }
            if(annexe2.getPlusValue() != null) {
                oldAnnexe2.setPlusValue(annexe2.getPlusValue());
            }
            if(annexe2.getLoyerHotels() != null) {
                oldAnnexe2.setLoyerHotels(annexe2.getLoyerHotels());
            }
            if(annexe2.getRemunerationArtiste() != null) {
                oldAnnexe2.setRemunerationArtiste(annexe2.getRemunerationArtiste());
            }
            if(annexe2.getMontantRetenues() != null) {
                oldAnnexe2.setMontantRetenues(annexe2.getMontantRetenues());
            }
            if(annexe2.getRetenueTVA() != null) {
                oldAnnexe2.setRetenueTVA(annexe2.getRetenueTVA());
            }

            if(annexe2.getMontantnet() != null) {
                oldAnnexe2.setMontantnet(annexe2.getMontantnet());
            }

            return annexe2Repository.save(oldAnnexe2);
        }
        else {
            throw new IllegalStateException(
                    "annexe1 with id" +id+ "does not exist"
            );
        }
    }

}
