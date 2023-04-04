package com.example.pfa.annexes3TypeId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class Annexe3TypeIdService {
    private final Annexe3TypeIdRepository annexe3TypeIdRepository;
    @Autowired
    public Annexe3TypeIdService(Annexe3TypeIdRepository annexe3TypeIdRepository) {
        this.annexe3TypeIdRepository = annexe3TypeIdRepository;
    }


    public void addAnnexe3TypeId(Annexe3TypeId annexe3TypeId) {
        annexe3TypeIdRepository.save(annexe3TypeId);
    }

    public List<Annexe3TypeId> getAnnexes3TypeId() {
        return annexe3TypeIdRepository.findAll();
    }

    public Annexe3TypeId getAnnexe3TypeId(Long id) {
        return annexe3TypeIdRepository.findById(id).get();
    }

    public void deleteAnnexe3TypeId(Long id) {
        boolean exist=annexe3TypeIdRepository.existsById(id);
        if (exist){
            annexe3TypeIdRepository.deleteById(id);
        }
        else {
            throw new IllegalStateException(
                    "post with id" +id+ "does not exist"
            );
        };
    }
}

