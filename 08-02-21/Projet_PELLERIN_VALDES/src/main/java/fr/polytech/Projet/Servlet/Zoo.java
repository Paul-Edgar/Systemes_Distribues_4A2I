package fr.polytech.Projet.Servlet;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "animal")
public class Zoo implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;

    @OneToMany
    @JoinColumn(name = "animal", referencedColumnName = "id")
    private List<Animal> animal;

    public Zoo() {

    }

    public Zoo(int id, String nom) {
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
