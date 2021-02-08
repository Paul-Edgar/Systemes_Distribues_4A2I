package fr.polytech.Projet.Servlet;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "maitre")
public class Maitre implements Serializable
{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;

    public Maitre()
    {

    }

    public Maitre(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
