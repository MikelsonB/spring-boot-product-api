<%@ page language="java" contentType="text/html; charset=windows-1256"
         pageEncoding="windows-1256" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="windows-1256">
    <title>Créer un Produit</title>
</head>
<body>
<form action="saveProduit" method="post">
<pre>
    AJOUTER/MODIFIER UN PRODUIT<br>
nom : <input type="text" name="nomProduit">
prix : <input type="text" name="prixProduit">
date création : <input type="date" name="date">
<input type="submit" value="ajouter">
${msg}
</pre>
</form>


<form action="getProduitByID" method="get">
<pre>
<br>
    CHERCHER PRODUIT PAR ID<br>
Entrez l'id du produit : <input type="text" name="id"><br>
<input type="submit">
</pre>
</form>


<br/>
<br/><a href="ListeProduits">Liste Produits</a>
</body>
</html>