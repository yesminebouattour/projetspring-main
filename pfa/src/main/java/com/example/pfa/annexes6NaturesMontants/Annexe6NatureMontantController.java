package com.example.pfa.annexes6NaturesMontants;


import com.example.pfa.annexes.Annexes;
import com.example.pfa.annexes.AnnexesService;
import com.example.pfa.annexes1.Annexe1;
import com.example.pfa.clients.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/")
public class Annexe6NatureMontantController {

    private final Annexe6NatureMontantService annexe6NatureMontantService;
    private ClientService clientService;
    private AnnexesService annexesService;
    @Autowired
    public Annexe6NatureMontantController(Annexe6NatureMontantService annexe6NatureMontantService, ClientService clientService,AnnexesService annexesService) {
        this.annexe6NatureMontantService = annexe6NatureMontantService;
        this.clientService=clientService;
        this.annexesService=annexesService;

    }
    @PostMapping("naturesMontants/")
    public Annexe6NatureMontant addNatureMontant(@RequestBody Annexe6NatureMontant natureMontant){

        annexe6NatureMontantService.addNatureMontatnt(natureMontant);
        return natureMontant;

    }
    @GetMapping("/naturesMontants/{annexesID}")
    public List<Annexe6NatureMontant> findByAnnexesId(@PathVariable Long annexesID) {
        return annexe6NatureMontantService.findByAnnexesId(annexesID);
    }
    @GetMapping("naturesMontants/")
    public List<Annexe6NatureMontant> getNaturesMontants(){
        return annexe6NatureMontantService.getNaturesMontants();
    }

    @GetMapping ("naturesMontants/delete/{id}")
    public void deleteNatureMontant(@PathVariable("id") Long id){
        annexe6NatureMontantService.deleteNatureMontant(id);
    }



}
