package com.example.demo.dao;

import com.example.demo.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProduitDaoImp implements ProduitDao{

    public static List<Product> produits = new ArrayList<>();
    static  {
        produits.add(new Product(1, "Switch", 1000));
        produits.add(new Product(2, "Tablette", 500));
        produits.add(new Product(3, "Telephone", 300));
        produits.add(new Product(4, "Routeur", 1500));

    }
    @Override
    public List<Product> findAll() {
        return produits;
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public Product save(Product prodit) {
        return null;
    }

}
