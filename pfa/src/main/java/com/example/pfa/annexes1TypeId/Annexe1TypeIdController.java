package com.example.pfa.annexes1TypeId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "api/")
public class Annexe1TypeIdController {
    private final Annexe1TypeIdService annexe1TypeIdService;
    @Autowired
    public Annexe1TypeIdController(Annexe1TypeIdService annexe1TypeIdService) {
        this.annexe1TypeIdService = annexe1TypeIdService;
    }


    @PostMapping("annexes1TypeId/")
    public Annexe1TypeId addAnnexe1TypeId(@RequestBody Annexe1TypeId annexe1TypeId){
        annexe1TypeIdService.addAnnexe1TypeId(annexe1TypeId);
        return annexe1TypeId;
    }
    @GetMapping("annexes1TypeId/")
    public List<Annexe1TypeId> getAnnexes1TypeId(){
        return annexe1TypeIdService.getAnnexes1TypeId();
    }
    @GetMapping("annexes1TypeId/{id}")
    public Annexe1TypeId getAnnexe1TypeId(@PathVariable Long id){
        return annexe1TypeIdService.getAnnexe1TypeId(id);
    }
    @GetMapping ("annexes1TypeId/delete/{id}")
    public void deleteAnnexe1TypeId(@PathVariable("id") Long id){
        annexe1TypeIdService.deleteAnnexe1TypeId(id);
    }
    @PostMapping ("annexes1TypeId/{id}")
    public void updateAnnexe1TypeId(@PathVariable("id") Long id , @RequestBody Annexe1TypeId annexe1TypeId){

        annexe1TypeIdService.updateAnnexe1TypeId(id,annexe1TypeId);
    }

}