package com.example.pfa.annexes4;


import com.example.pfa.annexes4TypeId.Annexe4TypeId;
import com.example.pfa.annexes4TypeId.Annexe4TypeIdService;
import com.example.pfa.annexes6NaturesMontants.Annexe6NatureMontant;
import com.example.pfa.annexes6NaturesMontants.Annexe6NatureMontantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/")
public class Annexe4Controller {
    private final Annexe4Service annexe4Service;
    private Annexe4TypeIdService annexe4TypeIdService;
    private Annexe6NatureMontantService annexe6NatureMontantService;
    @Autowired
    public Annexe4Controller(Annexe4Service annexe4Service,Annexe4TypeIdService annexe4TypeIdService,Annexe6NatureMontantService annexe6NatureMontantService) {
        this.annexe4Service = annexe4Service;
        this.annexe4TypeIdService=annexe4TypeIdService;
        this.annexe6NatureMontantService=annexe6NatureMontantService;

    }
    @PostMapping("annexes4/annexes4TypeId/NaturesMontants/")
    public Annexe4 addAnnexe4(@RequestBody Annexe4 annexe4){
        return annexe4Service.addAnnexe4(annexe4);

    }
    @GetMapping("annexes4/")
    public List<Annexe4> getAnnexes4(){
        return annexe4Service.getAnnexes4();
    }
    @GetMapping("annexes4/{id}")
    public Annexe4 getAnnexe4(@PathVariable Long id){
        return annexe4Service.getAnnexe4(id);
    }
    @GetMapping ("annexes4/delete/{id}")
    public void deleteAnnexe4(@PathVariable("id") Long id){
        annexe4Service.deleteAnnexe4(id);
    }
    @PostMapping("annexes4/{id}")
    public void updateAnnexe4(@PathVariable("id") Long id , @RequestBody Annexe4 annexe4){

        annexe4Service.updateAnnexe4(id,annexe4);
    }
}
