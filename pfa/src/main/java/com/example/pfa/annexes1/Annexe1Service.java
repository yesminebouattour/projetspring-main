package com.example.pfa.annexes1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class Annexe1Service {
    private final Annexe1Repository annexe1Repository;
    @Autowired
    public Annexe1Service(Annexe1Repository annexe1Repository) {
        this.annexe1Repository = annexe1Repository;
    }


    public Annexe1 addAnnexe1(Annexe1 annexe1) {
        return annexe1Repository.save(annexe1);
    }

    public List<Annexe1> getAnnexes1() {
        return annexe1Repository.findAll();
    }

    public Annexe1 getAnnexe1(Long id) {
        return annexe1Repository.findById(id).get();
    }

    public void deleteAnnexe1(Long id) {
        boolean exist=annexe1Repository.existsById(id);
        if (exist){
            annexe1Repository.deleteById(id);
        }
        else {
            throw new IllegalStateException(
                    "annexe1 with id" +id+ "does not exist"
            );
        };

    }


    public Annexe1 updateAnnexe1(Long id, Annexe1 annexe1) {
        boolean exist = annexe1Repository.existsById(id);
        if (exist){

            //annexe1Repository.save(annexe1);
            Annexe1 oldAnnexe1 =annexe1Repository.findById(id).get();
            if(annexe1.getNordre() != null) {
                oldAnnexe1.setNordre(annexe1.getNordre());
            }
            if(annexe1.getidCin() != null) {
                oldAnnexe1.setidCin(annexe1.getidCin());
            }
            if(annexe1.getName() != null) {
                oldAnnexe1.setName(annexe1.getName());
            }
            if(annexe1.getEmploi() != null) {
                oldAnnexe1.setEmploi(annexe1.getEmploi());
            }
            if(annexe1.getAdresse() != null) {
                oldAnnexe1.setAdresse(annexe1.getAdresse());
            }
            if(annexe1.getEnfant() != null) {
                oldAnnexe1.setEnfant(annexe1.getEnfant());
            }
            if(annexe1.getD1() != null) {
                oldAnnexe1.setD1(annexe1.getD1());
            }
            if(annexe1.getD2() != null) {
                oldAnnexe1.setD2(annexe1.getD2());
            }
            if(annexe1.getNjour() != null) {
                oldAnnexe1.setNjour(annexe1.getNjour());
            }
            if(annexe1.getRevenuImposable() != null) {
                oldAnnexe1.setRevenuImposable(annexe1.getRevenuImposable());
            }
            if(annexe1.getVavantages() != null) {
                oldAnnexe1.setVavantages(annexe1.getVavantages());
            }
            if(annexe1.getTotalrevenus() != null) {
                oldAnnexe1.setTotalrevenus(annexe1.getTotalrevenus());
            }
            if(annexe1.getRevenuréinvesti() != null) {
                oldAnnexe1.setRevenuréinvesti(annexe1.getRevenuréinvesti());
            }
            if(annexe1.getRedevence1() != null) {
                oldAnnexe1.setRedevence1(annexe1.getRedevence1());
            }
            if(annexe1.getRégimecommun() != null) {
                oldAnnexe1.setRégimecommun(annexe1.getRégimecommun());
            }
            if(annexe1.getContribution() != null) {
                oldAnnexe1.setContribution(annexe1.getContribution());
            }
            if(annexe1.getTauxde20() != null) {
                oldAnnexe1.setTauxde20(annexe1.getTauxde20());
            }
            if(annexe1.getMontantnet() != null) {
                oldAnnexe1.setMontantnet(annexe1.getMontantnet());
            }
            if(annexe1.getAnnexe1TypeId() != null) {
                oldAnnexe1.setAnnexe1TypeId(annexe1.getAnnexe1TypeId());
            }
            if(annexe1.getAnnexe1SFm() != null) {
                oldAnnexe1.setAnnexe1SFm(annexe1.getAnnexe1SFm());
            }
            return annexe1Repository.save(oldAnnexe1);
        }
        else {
            throw new IllegalStateException(
                    "annexe1 with id" +id+ "does not exist"
            );
        }
    }
}
