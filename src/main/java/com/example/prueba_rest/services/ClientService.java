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

    public Client getClientById(String clientId) {
        for (Client client : clients) {
            if (client.getClientId().equals(clientId)) {
                return client;
            }
        }
        return null;
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public void updateClient(String clientId, Client updatedClient) {
        Client client = getClientById(clientId);
        if (client != null) {
            client.setName(updatedClient.getName());
            client.setEmail(updatedClient.getEmail());
        }
    }

    public void deleteClient(String clientId) {
        Client client = getClientById(clientId);
        if (client != null) {
            clients.remove(client);
        }
    }
}
