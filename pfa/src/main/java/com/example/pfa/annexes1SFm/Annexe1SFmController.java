package com.example.pfa.annexes1SFm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(path = "api/")
public class Annexe1SFmController {
    private final Annexe1SFmService annexe1SFmService;
    @Autowired
    public Annexe1SFmController(Annexe1SFmService annexe1SFmService) {
        this.annexe1SFmService = annexe1SFmService;
    }


    @PostMapping("annexes1SFm/")
    public Annexe1SFm addAnnexe1SFm(@RequestBody Annexe1SFm annexe1SFm){
        annexe1SFmService.addAnnexe1SFm(annexe1SFm);
        return annexe1SFm;
    }
    @GetMapping("annexes1SFm/")
    public List<Annexe1SFm> getAnnexes1SFm(){
        return annexe1SFmService.getAnnexes1SFm();
    }
    @GetMapping("annexes1SFm/{id}")
    public Annexe1SFm getAnnexe1SFm(@PathVariable Long id){
        return annexe1SFmService.getAnnexe1SFm(id);
    }
    @GetMapping ("annexes1SFm/delete/{id}")
    public void deleteAnnexe1SFm(@PathVariable("id") Long id){
        annexe1SFmService.deleteAnnexe1SFm(id);
    }
    @PostMapping("annexes1SFm/{id}")
    public void updateAnnexe1SFm(@PathVariable("id") Long id , @RequestBody Annexe1SFm annexe1SFm){

        annexe1SFmService.updateAnnexe1SFm(id,annexe1SFm);
    }

}
