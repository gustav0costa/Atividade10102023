<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/criarProduto" var="linkServletCriarProduto"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Criação de Produto</title>
</head>
<body>
		<h2>Cadastro de Produto </h2>
		<form action="${linkServletCriarProduto}" method="post">
			Nome: <input type="text" name="nome" />
			<br>
			Preço: <input type="text" name="preco" />
			<br>
			Data de Criação: <input type="text" name="data" />
			<br>
			<input type="submit" value="Cadastrar" />
		</form>

</body>
</html>