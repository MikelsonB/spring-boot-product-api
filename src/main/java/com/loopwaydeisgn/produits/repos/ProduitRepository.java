package com.loopwaydeisgn.produits.repos;

import com.loopwaydeisgn.produits.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
    Produit findByNomProduit(String nomProduit);
}

