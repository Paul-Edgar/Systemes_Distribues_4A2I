package com.example.demo.controle;

import com.example.demo.dao.ProduitDao;
import com.example.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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
    //@RequestMapping(value = "produits/{id}", method = RequestMethod.GET)
    public Product renvoyerProduit(@PathVariable int id) {
        return new Product(1, "Switch", 1200);
    }

    @PostMapping(value = "create")
    public ResponseEntity<Void> ajouterUnPorduit(@RequestBody Product produit) {
        Product produit1 = this.produitDao.save(produit);
        if(produit==null)
        {
            return ResponseEntity.noContent().build();
        }
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{code}").buildAndExpand(produit1.getCode()).toUri();
        return ResponseEntity.created(location).build();
    }
}
