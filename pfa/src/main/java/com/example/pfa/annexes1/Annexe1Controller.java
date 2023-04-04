package com.example.pfa.annexes1;

import com.example.pfa.annexes1SFm.Annexe1SFm;
import com.example.pfa.annexes1SFm.Annexe1SFmService;
import com.example.pfa.annexes1TypeId.Annexe1TypeId;
import com.example.pfa.annexes1TypeId.Annexe1TypeIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/")
public class Annexe1Controller {
    private final Annexe1Service annexe1Service;
    private Annexe1SFmService annexe1SFmService;
    private Annexe1TypeIdService annexe1TypeIdService;

    @Autowired
    public Annexe1Controller(Annexe1Service annexe1Service,Annexe1SFmService annexe1SFmService,Annexe1TypeIdService annexe1TypeIdService) {
        this.annexe1Service = annexe1Service;
        this.annexe1SFmService=annexe1SFmService;
        this.annexe1TypeIdService=annexe1TypeIdService;
    }

    @PostMapping("annexes1/annexes1SFm/annexes1TypeId")
    public Annexe1 addAnnexe1(@RequestBody Annexe1 annexe1){
//        Annexe1SFm situation = annexe1SFmService.getAnnexe1SFm (1L);
//        annexe1.setAnnexe1SFm (situation);
//        Annexe1TypeId typeid =annexe1TypeIdService.getAnnexe1TypeId (1L);
//        annexe1.setAnnexe1TypeId (typeid);
//        annexe1Service.addAnnexe1(annexe1);
        return annexe1Service.addAnnexe1(annexe1);
        //return annexe1;
    }
    /*@PostMapping("annexes1/annexes1TypeId/{id}")
    public Annexe1 addAnnexe(@RequestBody Annexe1 annexe1,@PathVariable long id){
        Annexe1TypeId typeid =annexe1TypeIdService.getAnnexe1TypeId (id);
        annexe1.setAnnexe1TypeId (typeid);
        annexe1Service.addAnnexe1(annexe1);
        return annexe1;
    }*/
    @GetMapping("annexes1/")
    public List<Annexe1> getAnnexes1(){
        return annexe1Service.getAnnexes1();
    }
    @GetMapping("annexes1/{id}")
    public Annexe1 getAnnexe1(@PathVariable Long id){
        return annexe1Service.getAnnexe1(id);
    }
    @GetMapping ("annexes1/delete/{id}")
    public void deleteAnnexe1(@PathVariable("id") Long id){
        annexe1Service.deleteAnnexe1(id);
    }
    @PostMapping("annexes1/{id}")
    public void updateAnnexe1(@PathVariable("id") Long id , @RequestBody Annexe1 annexe1){

        annexe1Service.updateAnnexe1(id,annexe1);
    }
}
