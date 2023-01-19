package com.loopwaydeisgn.produits.services;

import com.loopwaydeisgn.produits.entities.Produit;
import com.loopwaydeisgn.produits.repos.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProduitServicesImpl implements ProduitServices {
    @Autowired
    ProduitRepository produitRepository;

    public Produit saveProduit(Produit p) {
        return produitRepository.save(p);
    }

    @Override
    public Produit updateProduit(Produit p) {
        return produitRepository.save(p);
    }

    @Override
    public Produit getProduitById(Long id) {
        return produitRepository.getReferenceById(id);
    }

    @Override
    public Produit findByNomProduit(String nomProduit) {
        return produitRepository.findByNomProduit(nomProduit);
    }
    @Override
    public void deleteProduit(Produit p) {
        produitRepository.delete(p);

    }

    @Override
    public void deleteProduitByID(Long id) {
    produitRepository.deleteById(id);
    }

    @Override
    public List<Produit> getAllProduit() {
        return produitRepository.findAll();

    }


}
