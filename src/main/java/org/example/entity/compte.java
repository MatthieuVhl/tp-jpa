package org.example.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_client")
    int id_client;

    String nom;

    String prenom;

    LocalDate dateNaissance;

    @ManyToMany(mappedBy = "clientList")
    List<compte> compteList = new ArrayList<>();


    public client() {
    }

    public int getIdClient() {
        return id_client;
    }

    public void setIdClient(int idClient) {
        this.id_client = idClient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public List<compte> getCompteList() {
        return compteList;
    }

    public void setCompteList(List<compte> compteList) {
        this.compteList = compteList;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + id_client +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", compteList=" + compteList +
                '}';
    }
}