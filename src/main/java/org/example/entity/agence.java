package org.example.entity;


import javax.persistence.*;
import java.util.List;
//
@Entity
public class agence {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_agence")
    int id_agence;
    String adresse;

    @OneToMany(mappedBy = "agence", cascade = CascadeType.ALL)
    private List<Compte> comptes;

    public agence() {
    }

    public int getId_agence() {
        return id_agence;
    }

    public void setIdAgence(int idAgence) {
        this.id_agence = idAgence;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<Compte> getCompte() {
        return comptes;
    }

    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }

    @Override
    public String toString() {
        return "Agence{" +
                "idAgence=" +id_agence +
                ", adresse='" + adresse + '\'' +
                ", comptes=" + compte +
                '}';
    }
}
