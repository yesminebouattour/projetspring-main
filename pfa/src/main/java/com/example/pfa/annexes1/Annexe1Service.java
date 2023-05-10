package com.example.pfa.annexes1;
import com.example.pfa.clients.Client;
import com.example.pfa.clients.ClientRepository;
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




    public List<Annexe1> findByClientId(Long clientId) {
        List<Annexe1> aa =  annexe1Repository.findByClientId(clientId);
        return aa;
    }

}
