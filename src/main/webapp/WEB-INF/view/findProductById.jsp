<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=windows-1256"
         pageEncoding="windows-1256" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="windows-1256">
    <title>Créer un Produit</title>
</head>
<body>
<h1 >
   Produit trouvé
</h1>
<table >
    <tr>
        <th>ID</th><th>Nom Produit</th><th>Prix</th><th>Date Création</th>
    </tr>

        <tr>
            <td>${produitbyid.idProduit }</td>
            <td>${produitbyid.nomProduit }</td>
            <td>${produitbyid.prixProduit }</td>
            <td><fmt:formatDate pattern="dd/MM/yyyy" value="${produitbyid.dateCreation}" /></td>

        </tr>

</table>
</body>
</html>