package com.example.pfa.clients;
import com.example.pfa.annexes1SFm.Annexe1SFmService;
import com.example.pfa.codePostale.CodePostaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "api/")
public class ClientController {


    private final  ClientService clientService;
    private CodePostaleService codePostaleService;
    @Autowired
    public ClientController(ClientService clientService,CodePostaleService codePostaleService) {
        this.clientService = clientService;
        this.codePostaleService=codePostaleService;
    }
    @PostMapping("clients/")
    public Client addClient(@RequestBody Client client){
        clientService.addClient(client);
        return client;
    }
    @GetMapping("clients/")
    public List<Client> getclients(){
        return clientService.getClients();
    }
    @GetMapping("clients/{id}")
    public Client getClient(@PathVariable Long id){
        return clientService.getClient(id);
    }
    @GetMapping("clients/delete/{id}")
    public void deleteClient(@PathVariable("id") Long id){
        clientService.deleteClient(id);
    }
//    @PostMapping("clients/{id}")
//    public void updateClient(@PathVariable("id") Long id , @RequestBody Client client){
//
//        clientService.updateClient(id,client);
//    }
}
