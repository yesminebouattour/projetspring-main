package com.example.pfa.annexes4TypeId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Annexe4TypeIdService {
    private final Annexe4TypeIdRepository annexe4TypeIdRepository;
    @Autowired
    public Annexe4TypeIdService(Annexe4TypeIdRepository annexe4TypeIdRepository) {
        this.annexe4TypeIdRepository = annexe4TypeIdRepository;
    }


    public void addAnnexe4TypeId(Annexe4TypeId annexe4TypeId) {
        annexe4TypeIdRepository.save(annexe4TypeId);
    }

    public List<Annexe4TypeId> getAnnexes4TypeId() {
        return annexe4TypeIdRepository.findAll();
    }

    public Annexe4TypeId getAnnexe4TypeId(Long id) {
        return annexe4TypeIdRepository.findById(id).get();
    }

    public void deleteAnnexe4TypeId(Long id) {
        boolean exist=annexe4TypeIdRepository.existsById(id);
        if (exist){
            annexe4TypeIdRepository.deleteById(id);
        }
        else {
            throw new IllegalStateException(
                    "post with id" +id+ "does not exist"
            );
        };
    }

    public Annexe4TypeId updateAnnexe4TypeId(Long id, Annexe4TypeId annexe4TypeId) {
        boolean exist = annexe4TypeIdRepository.existsById(id);
        if (exist){
            //annexe4TypeIdRepository.save(annexe4TypeId);
            Annexe4TypeId oldAnnexe4TypeId =annexe4TypeIdRepository.findById(id).get();
            if(annexe4TypeId.getTypeid() != null) {
                oldAnnexe4TypeId.setTypeid(annexe4TypeId.getTypeid());
            }
            return annexe4TypeIdRepository.save(oldAnnexe4TypeId);
        }
        else {
            throw new IllegalStateException(
                    "post with id" +id+ "does not exist"
            );
        }
    }

}


