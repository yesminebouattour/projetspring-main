package com.example.pfa.annexes2;


import com.example.pfa.annexes1.Annexe1;
import com.example.pfa.annexes2TypeId.Annexe2TypeId;
import com.example.pfa.annexes2TypeId.Annexe2TypeIdService;
import com.example.pfa.annexes6NaturesMontants.Annexe6NatureMontant;
import com.example.pfa.annexes6NaturesMontants.Annexe6NatureMontantService;
import com.example.pfa.clients.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/")
public class Annexe2Controller {
    private final Annexe2Service annexe2Service;
    private Annexe2TypeIdService annexe2TypeIdService;
    private Annexe6NatureMontantService annexe6NatureMontantService;
    private ClientService clientService;
    @Autowired
    public Annexe2Controller(Annexe2Service annexe2Service,Annexe2TypeIdService annexe2TypeIdService,Annexe6NatureMontantService annexe6NatureMontantService ,ClientService clientService) {
        this.annexe2Service = annexe2Service;
        this.annexe2TypeIdService=annexe2TypeIdService;
        this.annexe6NatureMontantService=annexe6NatureMontantService;
        this.clientService=clientService;


    }
    @PostMapping("annexes2/annexes2TypeId/NaturesMontants/")
    public Annexe2 addAnnexe2(@RequestBody Annexe2 annexe2){
        return annexe2Service.addAnnexe2(annexe2);

    }
    @GetMapping("/annexes2/{clientId}")
    public List<Annexe2> findByClientId(@PathVariable Long clientId) {
        return annexe2Service.findByClientId(clientId);
    }
    @GetMapping("annexes2/")
    public List<Annexe2> getAnnexes2(){
        return annexe2Service.getAnnexes2();
    }

    @GetMapping ("annexes2/delete/{id}")
    public void deleteAnnexe2(@PathVariable("id") Long id){
        annexe2Service.deleteAnnexe2(id);
    }

}
