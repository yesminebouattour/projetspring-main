package com.example.pfa.annexes5TypeId;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/")
public class Annexe5TypeIdController {
    private final Annexe5TypeIdService annexe5TypeIdService;
    @Autowired
    public Annexe5TypeIdController(Annexe5TypeIdService annexe5TypeIdService) {
        this.annexe5TypeIdService = annexe5TypeIdService;
    }
    @PostMapping("annexes5TypeId/")
    public Annexe5TypeId addAnnexe5TypeId(@RequestBody Annexe5TypeId annexe5TypeId){
        annexe5TypeIdService.addAnnexe5TypeId(annexe5TypeId);
        return annexe5TypeId;
    }
    @GetMapping("annexes5TypeId/")
    public List<Annexe5TypeId> getAnnexes5TypeId(){
        return annexe5TypeIdService.getAnnexes5TypeId();
    }
    @GetMapping("annexes5TypeId/{id}")
    public Annexe5TypeId getAnnexe5TypeId(@PathVariable Long id){
        return annexe5TypeIdService.getAnnexe5TypeId(id);
    }
    @GetMapping ("annexes5TypeId/delete/{id}")
    public void deleteAnnexe5TypeId(@PathVariable("id") Long id){
        annexe5TypeIdService.deleteAnnexe5TypeId(id);
    }
    @PostMapping ("annexes5TypeId/{id}")
    public void updateAnnexe5TypeId(@PathVariable("id") Long id , @RequestBody Annexe5TypeId annexe5TypeId){

        annexe5TypeIdService.updateAnnexe5TypeId(id,annexe5TypeId);
    }

}

