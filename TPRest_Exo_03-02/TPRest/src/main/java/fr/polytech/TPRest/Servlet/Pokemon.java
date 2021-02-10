package fr.polytech.TPRest.Servlet;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pokemon")
public class Pokemon implements Serializable
{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String nom;
    int lvl;


    public Pokemon()
    {

    }

    public Pokemon(int id, String nom, int lvl)
    {
        this.id = id;
        this.nom = nom;
        this.lvl = lvl;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public int getLvl()
    {
        return lvl;
    }

    public void setLvl(int lvl)
    {
        this.lvl = lvl;
    }

    @Override
    public String toString()
    {
        return "Pokemon[nom=" + nom + ", lvl=" + lvl + ']';
    }
}