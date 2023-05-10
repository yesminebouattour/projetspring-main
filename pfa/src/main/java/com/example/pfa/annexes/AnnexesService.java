package com.example.pfa.annexes;

import com.example.pfa.annexes1.Annexe1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class AnnexesService {
    private final AnnexesRepository annexeRepository;
    @Autowired

    public AnnexesService(AnnexesRepository annexeRepository) {
        this.annexeRepository = annexeRepository;
    }

    public Annexes addAnnexe(Annexes annexe) {
        return annexeRepository.save(annexe);
    }

    public List<Annexes> getAnnexe() {
        return annexeRepository.findAll();
    }

    public void deleteAnnexe(Long id) {
        boolean exist = annexeRepository.existsById(id);
        if (exist) {
            annexeRepository.deleteById(id);
        } else {
            throw new IllegalStateException(
                    "annexe1 with id" + id + "does not exist"
            );
        };
    }



}
