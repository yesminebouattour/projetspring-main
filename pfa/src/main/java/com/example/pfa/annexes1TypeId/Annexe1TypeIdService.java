package com.example.pfa.annexes1TypeId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class Annexe1TypeIdService {
    private final Annexe1TypeIdRepository annexe1TypeIdRepository;
    @Autowired
    public Annexe1TypeIdService(Annexe1TypeIdRepository annexe1TypeIdRepository) {
        this.annexe1TypeIdRepository = annexe1TypeIdRepository;
    }


    public void addAnnexe1TypeId(Annexe1TypeId annexe1TypeId) {
        annexe1TypeIdRepository.save(annexe1TypeId);
    }

    public List<Annexe1TypeId> getAnnexes1TypeId() {
        return annexe1TypeIdRepository.findAll();
    }

    public Annexe1TypeId getAnnexe1TypeId(Long id) {
        return annexe1TypeIdRepository.findById(id).get();
    }

    public void deleteAnnexe1TypeId(Long id) {
        boolean exist=annexe1TypeIdRepository.existsById(id);
        if (exist){
            annexe1TypeIdRepository.deleteById(id);
        }
        else {
            throw new IllegalStateException(
                    "post with id" +id+ "does not exist"
            );
        };
    }

    public Annexe1TypeId updateAnnexe1TypeId(Long id, Annexe1TypeId annexe1TypeId) {
        boolean exist = annexe1TypeIdRepository.existsById(id);
        if (exist){
            //annexe1TypeIdRepository.save(annexe1TypeId);
            Annexe1TypeId oldAnnexe1TypeId =annexe1TypeIdRepository.findById(id).get();
            if(annexe1TypeId.getTypeid() != null) {
                oldAnnexe1TypeId.setTypeid(annexe1TypeId.getTypeid());
            }
            return annexe1TypeIdRepository.save(oldAnnexe1TypeId);
        }
        else {
            throw new IllegalStateException(
                    "post with id" +id+ "does not exist"
            );
        }
    }

}
