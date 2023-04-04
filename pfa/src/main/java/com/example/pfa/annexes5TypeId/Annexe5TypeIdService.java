package com.example.pfa.annexes5TypeId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Annexe5TypeIdService {
    private final Annexe5TypeIdRepository annexe5TypeIdRepository;
    @Autowired
    public Annexe5TypeIdService(Annexe5TypeIdRepository annexe5TypeIdRepository) {
        this.annexe5TypeIdRepository = annexe5TypeIdRepository;
    }


    public void addAnnexe5TypeId(Annexe5TypeId annexe5TypeId) {
        annexe5TypeIdRepository.save(annexe5TypeId);
    }

    public List<Annexe5TypeId> getAnnexes5TypeId() {
        return annexe5TypeIdRepository.findAll();
    }

    public Annexe5TypeId getAnnexe5TypeId(Long id) {
        return annexe5TypeIdRepository.findById(id).get();
    }

    public void deleteAnnexe5TypeId(Long id) {
        boolean exist=annexe5TypeIdRepository.existsById(id);
        if (exist){
            annexe5TypeIdRepository.deleteById(id);
        }
        else {
            throw new IllegalStateException(
                    "post with id" +id+ "does not exist"
            );
        };
    }

    public Annexe5TypeId updateAnnexe5TypeId(Long id, Annexe5TypeId annexe5TypeId) {
        boolean exist = annexe5TypeIdRepository.existsById(id);
        if (exist){
            //annexe5TypeIdRepository.save(annexe5TypeId);
            Annexe5TypeId oldAnnexe5TypeId =annexe5TypeIdRepository.findById(id).get();
            if(annexe5TypeId.getTypeid() != null) {
                oldAnnexe5TypeId.setTypeid(annexe5TypeId.getTypeid());
            }
            return annexe5TypeIdRepository.save(oldAnnexe5TypeId);
        }
        else {
            throw new IllegalStateException(
                    "post with id" +id+ "does not exist"
            );
        }
    }

}



