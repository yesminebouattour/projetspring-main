package com.example.pfa.annexes7;

import com.example.pfa.annexes3TypeId.Annexe3TypeIdService;
import com.example.pfa.annexes6.Annexe6;
import com.example.pfa.annexes6NaturesMontants.Annexe6NatureMontantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/")
public class Annexe7Controller {

    private final Annexe7Service annexe7Service;
    private Annexe3TypeIdService annexe3TypeIdService;
    private Annexe6NatureMontantService annexe6NatureMontantService;
    @Autowired
    public Annexe7Controller(Annexe7Service annexe7Service, Annexe3TypeIdService annexe3TypeIdService, Annexe6NatureMontantService annexe6NatureMontantService) {
        this.annexe7Service = annexe7Service;
        this.annexe3TypeIdService = annexe3TypeIdService;
        this.annexe6NatureMontantService = annexe6NatureMontantService;
    }
    @PostMapping("annexes7/annexes7TypeId/NaturesMontants/")
    public Annexe7 addAnnexe7(@RequestBody Annexe7 annexe7){
        return annexe7Service.addAnnexe7(annexe7);

    }
    @GetMapping("annexes7/")
    public List<Annexe7> getAnnexes7(){
        return annexe7Service.getAnnexes7();
    }
    @GetMapping("annexes7/{id}")
    public Annexe7 getAnnexe7(@PathVariable Long id){
        return annexe7Service.getAnnexe7(id);
    }
    @GetMapping ("annexes7/delete/{id}")
    public void deleteAnnexe7(@PathVariable("id") Long id){
        annexe7Service.deleteAnnexe7(id);
    }

}

