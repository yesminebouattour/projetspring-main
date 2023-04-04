package com.example.pfa.annexes2TypeId;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/")
public class Annexe2TypeIdController {
    private final Annexe2TypeIdService annexe2TypeIdService;
    @Autowired
    public Annexe2TypeIdController(Annexe2TypeIdService annexe2TypeIdService) {
        this.annexe2TypeIdService = annexe2TypeIdService;
    }
    @PostMapping("annexes2TypeId/")
    public Annexe2TypeId addAnnexe2TypeId(@RequestBody Annexe2TypeId annexe2TypeId){
        annexe2TypeIdService.addAnnexe2TypeId(annexe2TypeId);
        return annexe2TypeId;
    }
    @GetMapping("annexes2TypeId/")
    public List<Annexe2TypeId> getAnnexes2TypeId(){
        return annexe2TypeIdService.getAnnexes2TypeId();
    }
    @GetMapping("annexes2TypeId/{id}")
    public Annexe2TypeId getAnnexe2TypeId(@PathVariable Long id){
        return annexe2TypeIdService.getAnnexe2TypeId(id);
    }
    @GetMapping ("annexes2TypeId/delete/{id}")
    public void deleteAnnexe2TypeId(@PathVariable("id") Long id){
        annexe2TypeIdService.deleteAnnexe2TypeId(id);
    }
    @PostMapping ("annexes2TypeId/{id}")
    public void updateAnnexe2TypeId(@PathVariable("id") Long id , @RequestBody Annexe2TypeId annexe2TypeId){

        annexe2TypeIdService.updateAnnexe2TypeId(id,annexe2TypeId);
    }

}
