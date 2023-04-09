package com.example.pfa.annexes6;


import com.example.pfa.annexes3TypeId.Annexe3TypeIdService;
import com.example.pfa.annexes6NaturesMontants.Annexe6NatureMontantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/")
public class Annexe6Controller {
    private final Annexe6Service annexe6Service;
    private Annexe3TypeIdService annexe3TypeIdService;
    private Annexe6NatureMontantService annexe6NatureMontantService;
    @Autowired
    public Annexe6Controller(Annexe6Service annexe6Service, Annexe3TypeIdService annexe3TypeIdService,Annexe6NatureMontantService annexe6NatureMontantService) {
        this.annexe6Service = annexe6Service;
        this.annexe3TypeIdService = annexe3TypeIdService;
        this.annexe6NatureMontantService=annexe6NatureMontantService;
    }


    @PostMapping("annexes6/annexes6TypeId/NaturesMontants/")
    public Annexe6 addAnnexe6(@RequestBody Annexe6 annexe6){
        return annexe6Service.addAnnexe6(annexe6);

    }
    @GetMapping("annexes6/")
    public List<Annexe6> getAnnexes6(){
        return annexe6Service.getAnnexes6();
    }
    @GetMapping("annexes6/{id}")
    public Annexe6 getAnnexe6(@PathVariable Long id){
        return annexe6Service.getAnnexe6(id);
    }
    @GetMapping ("annexes6/delete/{id}")
    public void deleteAnnexe6(@PathVariable("id") Long id){
        annexe6Service.deleteAnnexe6(id);
    }
}

