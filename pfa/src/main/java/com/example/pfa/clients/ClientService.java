package com.example.pfa.clients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClientService {
    private final ClientRepository clientRepository;
    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }
    public void addClient(Client client){
        clientRepository.save(client);
    }
    public List<Client> getClients(){
        return clientRepository.findAll();
    }
    public  Client getClient(Long id){
        return clientRepository.findById(id).get();
    }
    public void deleteClient(Long id){
        boolean exist=clientRepository.existsById(id);
        if (exist){
            clientRepository.deleteById(id);
        }
        else {
            throw new IllegalStateException(
                    "client with id" +id+ "does not exist"
            );
        };
    }
    public Client updateClient(Long id , Client client){
        boolean exist = clientRepository.existsById(id);
        if (exist){
            //clientRepository.save(client);
            Client oldClient=clientRepository.findById(id).get();
            if(client.getraisonsocial() != null) {
                oldClient.setraisonsocial(client.getraisonsocial());
            }
            if(client.getNumero() != null) {
                oldClient.setNumero(client.getNumero());
            }
            if(client.getCode() != null) {
                oldClient.setCode(client.getCode());
            }
            if(client.getcodeTVA() != null) {
                oldClient.setcodeTVA(client.getcodeTVA());
            }
            if(client.getNétablissement() != null) {
                oldClient.setNétablissement(client.getNétablissement());
            }
            if(client.getCodePostale() != null) {
                oldClient.setCodePostale(client.getCodePostale());
            }
            if(client.getActivité() != null) {
                oldClient.setActivité(client.getActivité());
            }
            if(client.getRue() != null) {
                oldClient.setRue(client.getRue());
            }
            if(client.getCatégorie() != null) {
                oldClient.setCatégorie(client.getCatégorie());
            }
            if(client.getClef() != null) {
                oldClient.setClef(client.getClef());
            }
            return   clientRepository.save(oldClient);

        }
        else {
            throw new IllegalStateException(
                    "client with id" +id+ "does not exist"
            );
        }
    }


}