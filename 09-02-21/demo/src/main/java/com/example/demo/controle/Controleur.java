package com.example.demo.controle;

import com.example.demo.dao.ProduitDao;
import com.example.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controleur {

    // injection des dépendances et inversion de controle
    @Autowired
    private ProduitDao produitDao;

    @GetMapping(value = "produits")
    public List<Product> listProduits() {
        return this.produitDao.findAll();
    }

    // endpoint ..... /produits/{id}
    @GetMapping(value = "produits/{id}" )
    public Product renvoyerProduit(@PathVariable int id) {
        return new Product(1, "Switch", 1200);
    }
}
