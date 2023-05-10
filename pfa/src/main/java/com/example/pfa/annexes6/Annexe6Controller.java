package com.example.pfa.annexes6;


import com.example.pfa.annexes1.Annexe1;
import com.example.pfa.annexes3TypeId.Annexe3TypeIdService;
import com.example.pfa.annexes6NaturesMontants.Annexe6NatureMontantService;
import com.example.pfa.clients.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/")
public class Annexe6Controller {
    private final Annexe6Service annexe6Service;
    private Annexe3TypeIdService annexe3TypeIdService;
    private Annexe6NatureMontantService annexe6NatureMontantService;
    private ClientService clientService;

    @Autowired
    public Annexe6Controller(Annexe6Service annexe6Service, Annexe3TypeIdService annexe3TypeIdService,Annexe6NatureMontantService annexe6NatureMontantService,ClientService clientService) {
        this.annexe6Service = annexe6Service;
        this.annexe3TypeIdService = annexe3TypeIdService;
        this.annexe6NatureMontantService=annexe6NatureMontantService;
        this.clientService=clientService;

    }


    @PostMapping("annexes6/annexes6TypeId/NaturesMontants/")
    public Annexe6 addAnnexe6(@RequestBody Annexe6 annexe6){
        return annexe6Service.addAnnexe6(annexe6);

    }
    @GetMapping("/annexes6/{clientId}")
    public List<Annexe6> findByClientId(@PathVariable Long clientId) {
        return annexe6Service.findByClientId(clientId);
    }
    @GetMapping("annexes6/")
    public List<Annexe6> getAnnexes6(){
        return annexe6Service.getAnnexes6();
    }

    @GetMapping ("annexes6/delete/{id}")
    public void deleteAnnexe6(@PathVariable("id") Long id){
        annexe6Service.deleteAnnexe6(id);
    }
}
