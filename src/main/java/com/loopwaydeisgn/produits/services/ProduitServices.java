package com.loopwaydeisgn.produits.services;

import com.loopwaydeisgn.produits.entities.Produit;
import com.loopwaydeisgn.produits.repos.ProduitRepository;

import java.util.List;

public interface ProduitServices  {


 Produit saveProduit(Produit p);
 Produit updateProduit(Produit p);
 Produit getProduitById(Long id);
 void deleteProduit(Produit p);
 void deleteProduitByID(Long id);
 List<Produit> getAllProduit();
 Produit findByNomProduit(String nomProduit);

}
