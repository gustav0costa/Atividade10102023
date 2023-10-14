<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/removeProduto" var="linkServletRemoverProduto"/>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <title>Excluir Produto</title>
</head>
<body>
    <h1>Excluir Produto</h1>
    <p>Desejar excluir o produto ${produto.nome} ?</p>
    <form action="${linkServletRemoverProduto}" method="post">
		<input type="hidden" name="id" value="${produto.id}"/>	
		<input type="submit" value="Sim" />
		<a href="listarProdutos"> Não </a>
	</form>
    
</body>
</html>
