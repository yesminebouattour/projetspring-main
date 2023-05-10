package com.example.pfa.annexes3;


import com.example.pfa.annexes1.Annexe1;
import com.example.pfa.annexes2.Annexe2;
import com.example.pfa.annexes2TypeId.Annexe2TypeIdService;
import com.example.pfa.annexes3TypeId.Annexe3TypeIdService;
import com.example.pfa.clients.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/")
public class Annexe3Controller {
    private final Annexe3Service annexe3Service;
    private Annexe3TypeIdService annexe3TypeIdService;
    private ClientService clientService;

    @Autowired
    public Annexe3Controller(Annexe3Service annexe3Service ,Annexe3TypeIdService annexe3TypeIdService,ClientService clientService) {
        this.annexe3Service = annexe3Service;
        this.annexe3TypeIdService=annexe3TypeIdService;
        this.clientService=clientService;

    }
    @PostMapping("annexes3/annexes3TypeId/")
    public Annexe3 addAnnexe3(@RequestBody Annexe3 annexe3){
        return annexe3Service.addAnnexe3(annexe3);

    }
    @GetMapping("/annexes3/{clientId}")
    public List<Annexe3> findByClientId(@PathVariable Long clientId) {
        return annexe3Service.findByClientId(clientId);
    }
    @GetMapping("annexes3/")
    public List<Annexe3> getAnnexes3(){
        return annexe3Service.getAnnexes3();
    }

    @GetMapping ("annexes3/delete/{id}")
    public void deleteAnnexe3(@PathVariable("id") Long id){
        annexe3Service.deleteAnnexe3(id);
    }

}
