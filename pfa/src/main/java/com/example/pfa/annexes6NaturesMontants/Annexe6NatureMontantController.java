package com.example.pfa.annexes6NaturesMontants;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/")
public class Annexe6NatureMontantController {

    private final Annexe6NatureMontantService annexe6NatureMontantService;
    @Autowired
    public Annexe6NatureMontantController(Annexe6NatureMontantService annexe6NatureMontantService) {
        this.annexe6NatureMontantService = annexe6NatureMontantService;
    }
    @PostMapping("naturesMontants/")
    public Annexe6NatureMontant addNatureMontant(@RequestBody Annexe6NatureMontant natureMontant){

        annexe6NatureMontantService.addNatureMontatnt(natureMontant);
        return natureMontant;

    }
    @GetMapping("naturesMontants/")
    public List<Annexe6NatureMontant> getNaturesMontants(){
        return annexe6NatureMontantService.getNaturesMontants();
    }
    @GetMapping("naturesMontants/{id}")
    public Annexe6NatureMontant getNatureMontant(@PathVariable Long id){
        return annexe6NatureMontantService.getNatureMontant(id);
    }
    @GetMapping ("naturesMontants/delete/{id}")
    public void deleteNatureMontant(@PathVariable("id") Long id){
        annexe6NatureMontantService.deleteNatureMontant(id);
    }
    @PostMapping("naturesMontants/{id}")
    public void updateNatureMontant(@PathVariable("id") Long id , @RequestBody Annexe6NatureMontant natureMontant){

        annexe6NatureMontantService.updateNatureMontant(id,natureMontant);
    }


}
