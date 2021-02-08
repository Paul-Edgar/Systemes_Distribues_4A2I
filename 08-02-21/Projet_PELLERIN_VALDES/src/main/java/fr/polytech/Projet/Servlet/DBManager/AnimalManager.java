package fr.polytech.Projet.Servlet.DBManager;

import fr.polytech.Projet.Servlet.Animal;
import org.hibernate.Session;
import org.hibernate.query.Query;
import java.util.List;

public class AnimalManager
{
    /**
     * Permet de récupérer tous les animaux
     *
     * @return liste de tous les animaux
     */
    public Animal create(Animal animal)
    {
        Session session = HibernateFactory.getSession();
        session.beginTransaction();
        session.save(animal);
        session.getTransaction().commit();
        session.beginTransaction();
        session.save(animal.getMaitre());
        session.getTransaction().commit();

        return animal;
    }

    public List<Animal> getAll()
    {
        Session session = HibernateFactory.getSession();
        Query query = session.createQuery("select animal from Animal as animal");

        return query.getResultList();
    }

    public Animal getById(int id)
    {
        Session session = HibernateFactory.getSession();
        Query query = session.createQuery("select animal from Animal as animal where animal.id=:id");
        query.setParameter("id", id);

        return (Animal) query.getSingleResult();
    }

    public Animal update(Animal animal)
    {
        Session session = HibernateFactory.getSession();
        session.beginTransaction();
        session.update(animal);
        session.getTransaction().commit();

        return animal;
    }

    public Animal delete(Animal animal)
    {
        Session session = HibernateFactory.getSession();
        session.beginTransaction();
        session.delete(animal);
        session.getTransaction().commit();

        return animal;
    }
}