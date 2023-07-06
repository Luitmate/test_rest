package com.example.prueba_rest.services;

import com.example.prueba_rest.model.Client;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {
    private List<Client> clients = new ArrayList<>();

    public List<Client> getAllClients() {
        return clients;
    }

    public void addClient(Client client) {
        clients.add(client);
    }
}
