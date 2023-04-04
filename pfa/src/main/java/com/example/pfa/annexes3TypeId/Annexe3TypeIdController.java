package com.example.pfa.annexes3TypeId;

import com.example.pfa.annexes2TypeId.Annexe2TypeId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/")
public class Annexe3TypeIdController {
    private final Annexe3TypeIdService annexe3TypeIdService;
    @Autowired
    public Annexe3TypeIdController(Annexe3TypeIdService annexe3TypeIdService) {
        this.annexe3TypeIdService = annexe3TypeIdService;
    }
    @PostMapping("annexes3TypeId/")
    public Annexe3TypeId addAnnexe3TypeId(@RequestBody Annexe3TypeId annexe3TypeId){
        annexe3TypeIdService.addAnnexe3TypeId(annexe3TypeId);
        return annexe3TypeId;
    }
    @GetMapping("annexes3TypeId/")
    public List<Annexe3TypeId> getAnnexes3TypeId(){
        return annexe3TypeIdService.getAnnexes3TypeId();
    }
    @GetMapping("annexes3TypeId/{id}")
    public Annexe3TypeId getAnnexe3TypeId(@PathVariable Long id){
        return annexe3TypeIdService.getAnnexe3TypeId(id);
    }
    @GetMapping ("annexes3TypeId/delete/{id}")
    public void deleteAnnexe3TypeId(@PathVariable("id") Long id){
        annexe3TypeIdService.deleteAnnexe3TypeId(id);
    }


}