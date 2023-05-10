package com.example.pfa.annexes1;

import com.example.pfa.annexes1SFm.Annexe1SFm;
import com.example.pfa.annexes1SFm.Annexe1SFmService;
import com.example.pfa.annexes1TypeId.Annexe1TypeId;
import com.example.pfa.annexes1TypeId.Annexe1TypeIdService;
import com.example.pfa.clients.Client;
import com.example.pfa.clients.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/")
public class Annexe1Controller {
    private final Annexe1Service annexe1Service;
    private Annexe1SFmService annexe1SFmService;
    private Annexe1TypeIdService annexe1TypeIdService;
    private ClientService clientService;

    @Autowired
    public Annexe1Controller(Annexe1Service annexe1Service,Annexe1SFmService annexe1SFmService,Annexe1TypeIdService annexe1TypeIdService ,ClientService clientService) {
        this.annexe1Service = annexe1Service;
        this.annexe1SFmService=annexe1SFmService;
        this.annexe1TypeIdService=annexe1TypeIdService;
        this.clientService=clientService;
    }

    @PostMapping("annexes1/annexes1SFm/annexes1TypeId/")
    public Annexe1 addAnnexe1(@RequestBody Annexe1 annexe1){

        return annexe1Service.addAnnexe1(annexe1);

    }


    @GetMapping("/annexes1/{clientId}")
    public List<Annexe1> findByClientId(@PathVariable Long clientId) {
        return annexe1Service.findByClientId(clientId);
    }
    @GetMapping("annexes1/")
    public List<Annexe1> getAnnexes1(){
        return annexe1Service.getAnnexes1();
    }

    @GetMapping ("annexes1/delete/{id}")
    public void deleteAnnexe1(@PathVariable("id") Long id){
        annexe1Service.deleteAnnexe1(id);
    }

}
