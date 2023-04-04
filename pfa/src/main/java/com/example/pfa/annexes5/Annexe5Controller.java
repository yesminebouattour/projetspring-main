package com.example.pfa.annexes5;


import com.example.pfa.annexes5TypeId.Annexe5TypeIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/")
public class Annexe5Controller {
    private final Annexe5Service annexe5Service;
    private Annexe5TypeIdService annexe5TypeIdService;

    @Autowired
    public Annexe5Controller(Annexe5Service annexe5Service ,Annexe5TypeIdService annexe5TypeIdService) {
        this.annexe5Service = annexe5Service;
        this.annexe5TypeIdService=annexe5TypeIdService;
    }
    @PostMapping("annexes5/annexes5TypeId/")
    public Annexe5 addAnnexe5(@RequestBody Annexe5 annexe5){
        return annexe5Service.addAnnexe5(annexe5);

    }
    @GetMapping("annexes5/")
    public List<Annexe5> getAnnexes5(){
        return annexe5Service.getAnnexes5();
    }
    @GetMapping("annexes5/{id}")
    public Annexe5 getAnnexe5(@PathVariable Long id){
        return annexe5Service.getAnnexe5(id);
    }
    @GetMapping ("annexes5/delete/{id}")
    public void deleteAnnexe5(@PathVariable("id") Long id){
        annexe5Service.deleteAnnexe5(id);
    }

}

