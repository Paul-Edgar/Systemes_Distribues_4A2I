package com.example.demo.dao;

import com.example.demo.model.Product;

import java.util.List;

public interface ProduitDao {
    public List<Product> findAll();
    public Product findById(int id);
    public Product save(Product prodit);
}
