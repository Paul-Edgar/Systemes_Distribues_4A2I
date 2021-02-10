package fr.polytech.Projet.Servlet;

import javax.persistence.*;
import java.io.Serializable;
import fr.polytech.Projet.Servlet.Soigneur;

@Entity
@Table(name = "animal")
public class Animal implements Serializable
{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;
    private String race;

    @OneToOne
    @JoinColumn(name = "id_soigneur", referencedColumnName = "id")
    private Soigneur soigneur;

    @ManyToOne
    @JoinColumn(name = "id_zoo", referencedColumnName = "id")
    private Zoo zoo;

    public Animal(int id, String nom, String race) {
        this.id = id;
        this.nom = nom;
        this.race = race;
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

    public String getRace() { return race; }

    public void setRace(String race) { this.race = race; }

    public Soigneur getSoigneur() {
        return soigneur;
    }

    public void setSoigneur(Soigneur soigneur) {
        this.soigneur = soigneur;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public String toString()
    {
        return "Animal[nom=" + nom + ", race=" + race  + ']';
    }
}