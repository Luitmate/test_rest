package com.example.prueba_rest.controllers;

import com.example.prueba_rest.model.Client;
import com.example.prueba_rest.services.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clients")
public class ClientController {
    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @GetMapping("/{clientId}")
    public Client getClientById(@PathVariable String clientId) {
        return clientService.getClientById(clientId);
    }

    @PostMapping
    public void addClient(@RequestBody Client client) {
        clientService.addClient(client);
    }

    @PutMapping("/{clientId}")
    public void updateClient(@PathVariable String clientId, @RequestBody Client updatedClient) {
        clientService.updateClient(clientId, updatedClient);
    }

    @DeleteMapping("/{clientId}")
    public void deleteClient(@PathVariable String clientId) {
        clientService.deleteClient(clientId);
    }
}
