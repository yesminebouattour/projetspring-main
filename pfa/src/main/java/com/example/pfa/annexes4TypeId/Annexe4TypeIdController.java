package com.example.pfa.annexes4TypeId;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/")
public class Annexe4TypeIdController {
    private final Annexe4TypeIdService annexe4TypeIdService;
    @Autowired
    public Annexe4TypeIdController(Annexe4TypeIdService annexe4TypeIdService) {
        this.annexe4TypeIdService = annexe4TypeIdService;
    }
    @PostMapping("annexes4TypeId/")
    public Annexe4TypeId addAnnexe4TypeId(@RequestBody Annexe4TypeId annexe4TypeId){
        annexe4TypeIdService.addAnnexe4TypeId(annexe4TypeId);
        return annexe4TypeId;
    }
    @GetMapping("annexes4TypeId/")
    public List<Annexe4TypeId> getAnnexes4TypeId(){
        return annexe4TypeIdService.getAnnexes4TypeId();
    }
    @GetMapping("annexes4TypeId/{id}")
    public Annexe4TypeId getAnnexe4TypeId(@PathVariable Long id){
        return annexe4TypeIdService.getAnnexe4TypeId(id);
    }
    @GetMapping ("annexes4TypeId/delete/{id}")
    public void deleteAnnexe4TypeId(@PathVariable("id") Long id){
        annexe4TypeIdService.deleteAnnexe4TypeId(id);
    }
    @PostMapping ("annexes4TypeId/{id}")
    public void updateAnnexe4TypeId(@PathVariable("id") Long id , @RequestBody Annexe4TypeId annexe4TypeId){

        annexe4TypeIdService.updateAnnexe4TypeId(id,annexe4TypeId);
    }

}
