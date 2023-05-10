package com.example.pfa.annexes5;


import com.example.pfa.annexes1.Annexe1;
import com.example.pfa.annexes5TypeId.Annexe5TypeIdService;
import com.example.pfa.clients.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/")
public class Annexe5Controller {
    private final Annexe5Service annexe5Service;
    private Annexe5TypeIdService annexe5TypeIdService;
    private ClientService clientService;

    @Autowired
    public Annexe5Controller(Annexe5Service annexe5Service ,Annexe5TypeIdService annexe5TypeIdService,ClientService clientService) {
        this.annexe5Service = annexe5Service;
        this.annexe5TypeIdService=annexe5TypeIdService;
        this.clientService=clientService;

    }
    @PostMapping("annexes5/annexes5TypeId/")
    public Annexe5 addAnnexe5(@RequestBody Annexe5 annexe5){
        return annexe5Service.addAnnexe5(annexe5);

    }
    @GetMapping("/annexes5/{clientId}")
    public List<Annexe5> findByClientId(@PathVariable Long clientId) {
        return annexe5Service.findByClientId(clientId);
    }
    @GetMapping("annexes5/")
    public List<Annexe5> getAnnexes5(){
        return annexe5Service.getAnnexes5();
    }

    @GetMapping ("annexes5/delete/{id}")
    public void deleteAnnexe5(@PathVariable("id") Long id){
        annexe5Service.deleteAnnexe5(id);
    }

}

