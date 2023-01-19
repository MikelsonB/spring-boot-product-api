package com.loopwaydeisgn.produits.controllers;

import com.loopwaydeisgn.produits.entities.Produit;
import com.loopwaydeisgn.produits.services.ProduitServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Controller
    public class ProduitController {
        @Autowired
        ProduitServices produitService;

        @GetMapping("/home")
        public String home() {
            return "productUserInterface";
        }

        @RequestMapping("/saveProduit")
        public String saveProdouitMethod(@RequestParam("date") String date, @RequestParam String nomProduit, @RequestParam double prixProduit,@ModelAttribute Produit p , Model m)
                throws
                ParseException

        {

            //conversion de la date
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            Date dateCreation = dateformat.parse(String.valueOf(date));
            p.setDateCreation(dateCreation);

            if (produitService.findByNomProduit(nomProduit)!=null)

            {
                Produit produit= produitService.findByNomProduit(nomProduit);
                produit.setPrixProduit(prixProduit);
                produitService.updateProduit(produit);
                String msg ="produit enregistré avec Id "+ produit.getIdProduit() + " a été modifié";
                m.addAttribute("msg", msg);

                return ("createProduit");

            }
            else
                produitService.saveProduit(p);
            String msg ="produit enregistré avec Id "+ p.getIdProduit();
            m.addAttribute("msg", msg);
            return "createProduit";
        }


    @RequestMapping("/ListeProduits")  String ListeProduits(Model m)
    {   List<Produit> listproduit =produitService.getAllProduit();
        m.addAttribute( "produits",listproduit);

        return ("listeProduits");
    }


    @RequestMapping("/getProduitByID")  String getProduitByID(@RequestParam Long id,Model m)
    {   Produit produit =produitService.getProduitById(id);
        m.addAttribute( "produitbyid",produit);

        return ("findProductById");
    }

    @RequestMapping("/supprimerProduit")
    public String supprimerProduit(@RequestParam  Long id, Model m)
    {
        produitService.deleteProduitByID(id);
       return ListeProduits(m);
    }

}
