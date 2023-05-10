package com.example.pfa.annexes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/")
public class AnnexesController {
    private final AnnexesService annexeService;
    @Autowired

    public AnnexesController(AnnexesService annexeService) {
        this.annexeService = annexeService;
    }
    @PostMapping("annexe/")
    public Annexes addAnnexe(@RequestBody Annexes annexe){
        return annexeService.addAnnexe(annexe);

    }

    @GetMapping("annexe/")
    public List<Annexes> getAnnexe(){
        return annexeService.getAnnexe();
    }

    @GetMapping ("annexe/delete/{id}")
    public void deleteAnnexe(@PathVariable("id") Long id){
        annexeService.deleteAnnexe(id);
    }


}
