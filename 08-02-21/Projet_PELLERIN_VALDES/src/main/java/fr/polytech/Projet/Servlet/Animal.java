package fr.polytech.Projet.Servlet;

import javax.persistence.*;
import java.io.Serializable;
import fr.polytech.Projet.Servlet.Maitre;

@Entity
@Table(name = "animal")
public class Animal implements Serializable
{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;
    private float taille;
    private float poids;

    @OneToOne
    @JoinColumn(name = "maitre", referencedColumnName = "id")
    private Maitre maitre;

    public Animal(int id, String nom, float taille, float poids) {
        this.id = id;
        this.nom = nom;
        this.taille = taille;
        this.poids = poids;
    }

    public Animal()
    {

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

    public float getTaille() {
        return taille;
    }

    public void setTaille(float taille) {
        this.taille = taille;
    }

    public float getPoids() {
        return poids;
    }

    public void setPoids(float poids) {
        this.poids = poids;
    }

    public Maitre getMaitre() {
        return maitre;
    }

    public void setMaitre(Maitre maitre) {
        this.maitre = maitre;
    }

    @Override
    public String toString()
    {
        return "Animal[nom=" + nom + ", taille=" + taille + ", poids=" + poids + ']';
    }
}