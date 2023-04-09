package com.example.pfa.codePostale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CodePostaleService {
    private final CodePostaleRepository codePostaleRepositoryRepository;
    @Autowired
    public CodePostaleService(CodePostaleRepository codePostaleRepositoryRepository) {
        this.codePostaleRepositoryRepository = codePostaleRepositoryRepository;
    }


    public CodePostale addCodePostale(CodePostale codePostale) {
        return codePostaleRepositoryRepository.save(codePostale);
    }

    public List<CodePostale> getCodesPostales() {
        return codePostaleRepositoryRepository.findAll();
    }

    public CodePostale getCodePostale(Long id) {
        return codePostaleRepositoryRepository.findById(id).get();
    }

    public void deleteCodePostale(Long id) {
        boolean exist=codePostaleRepositoryRepository.existsById(id);
        if (exist){
            codePostaleRepositoryRepository.deleteById(id);
        }
        else {
            throw new IllegalStateException(
                    "annexe1 with id" +id+ "does not exist"
            );
        };

    }
}

