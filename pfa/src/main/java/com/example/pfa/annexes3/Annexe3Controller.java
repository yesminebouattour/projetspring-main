package com.example.pfa.annexes3;


import com.example.pfa.annexes2.Annexe2;
import com.example.pfa.annexes2TypeId.Annexe2TypeIdService;
import com.example.pfa.annexes3TypeId.Annexe3TypeIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/")
public class Annexe3Controller {
    private final Annexe3Service annexe3Service;
    private Annexe3TypeIdService annexe3TypeIdService;

    @Autowired
    public Annexe3Controller(Annexe3Service annexe3Service ,Annexe3TypeIdService annexe3TypeIdService) {
        this.annexe3Service = annexe3Service;
        this.annexe3TypeIdService=annexe3TypeIdService;
    }
    @PostMapping("annexes3/annexes3TypeId/")
    public Annexe3 addAnnexe3(@RequestBody Annexe3 annexe3){
        return annexe3Service.addAnnexe3(annexe3);

    }
    @GetMapping("annexes3/")
    public List<Annexe3> getAnnexes3(){
        return annexe3Service.getAnnexes3();
    }
    @GetMapping("annexes3/{id}")
    public Annexe3 getAnnexe3(@PathVariable Long id){
        return annexe3Service.getAnnexe3(id);
    }
    @GetMapping ("annexes3/delete/{id}")
    public void deleteAnnexe3(@PathVariable("id") Long id){
        annexe3Service.deleteAnnexe3(id);
    }

}
