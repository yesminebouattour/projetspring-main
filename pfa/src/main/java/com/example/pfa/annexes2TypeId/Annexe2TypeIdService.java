package com.example.pfa.annexes2TypeId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Annexe2TypeIdService {
    private final Annexe2TypeIdRepository annexe2TypeIdRepository;
    @Autowired
    public Annexe2TypeIdService(Annexe2TypeIdRepository annexe2TypeIdRepository) {
        this.annexe2TypeIdRepository = annexe2TypeIdRepository;
    }


    public void addAnnexe2TypeId(Annexe2TypeId annexe2TypeId) {
        annexe2TypeIdRepository.save(annexe2TypeId);
    }

    public List<Annexe2TypeId> getAnnexes2TypeId() {
        return annexe2TypeIdRepository.findAll();
    }

    public Annexe2TypeId getAnnexe2TypeId(Long id) {
        return annexe2TypeIdRepository.findById(id).get();
    }

    public void deleteAnnexe2TypeId(Long id) {
        boolean exist=annexe2TypeIdRepository.existsById(id);
        if (exist){
            annexe2TypeIdRepository.deleteById(id);
        }
        else {
            throw new IllegalStateException(
                    "post with id" +id+ "does not exist"
            );
        };
    }

    public Annexe2TypeId updateAnnexe2TypeId(Long id, Annexe2TypeId annexe2TypeId) {
        boolean exist = annexe2TypeIdRepository.existsById(id);
        if (exist){
            //annexe2TypeIdRepository.save(annexe2TypeId);
            Annexe2TypeId oldAnnexe2TypeId =annexe2TypeIdRepository.findById(id).get();
            if(annexe2TypeId.getTypeid() != null) {
                oldAnnexe2TypeId.setTypeid(annexe2TypeId.getTypeid());
            }
            return annexe2TypeIdRepository.save(oldAnnexe2TypeId);
        }
        else {
            throw new IllegalStateException(
                    "post with id" +id+ "does not exist"
            );
        }
    }

}

