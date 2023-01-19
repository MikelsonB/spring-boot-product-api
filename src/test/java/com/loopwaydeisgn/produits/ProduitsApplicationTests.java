package com.loopwaydeisgn.produits;

import com.loopwaydeisgn.produits.entities.Produit;
import com.loopwaydeisgn.produits.repos.ProduitRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class ProduitsApplicationTests {

   @Autowired
    ProduitRepository produitRepository;
    @Test
    public void testCreateProduit() {
        Produit p = new Produit("Lenovo", 7000.00, new Date());
        produitRepository.save(p);
    }

    @Test
    public void testFindProduit()
    { Produit p = produitRepository.findById(2L).get();
        System.out.println(p);
    }

    @Test
    public void testUpdateProduit()
    {
        Produit p= produitRepository.findById(2L).get();
        p.setPrixProduit(8000.99);
        produitRepository.save(p);
    }

    @Test
    public void testDeleteProduit()
    {
        produitRepository.deleteById(1L);
    }

    @Test
    public void testListerTousProduits()
    {
        List<Produit> prods = produitRepository.findAll();
        for (Produit p : prods)
        {
            System.out.println(p);
        }
    }

}