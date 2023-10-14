<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/editaProduto" var="linkServletAtualizarProduto"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Retificar produto</title>
</head>
<body>
	<h2>Atualização de Produto </h2>
	<form action="${linkServletAtualizarProduto}" method="post">
		<input type="hidden" name="id" value="${produto.id}"/>
		<br>
		Nome: <input type="text" name="nome" value="${produto.nome}"/>
		<br>
		Preço: <input type="text" name="preco" value="${produto.preco}"/>
		<br>
		Data de Criação: <input type="text" name="data" value="<fmt:formatDate value="${produto.data}" pattern="dd/MM/yyyy"/> " />
		<br>	
		<input type="submit" value="Retificar" />
	</form>
</body>
</html>