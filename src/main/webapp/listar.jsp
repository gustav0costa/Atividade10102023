<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de produtos</title>
</head>
<body>
	<c:if test="${not empty produto}">		
	        <p>Produto ${nomeProduto} criado com sucesso!</p>	   
    </c:if>	
	
	<p>Lista de produtos</p>
	
	<ul>
		<c:forEach items="${listaProdutos}" var="produto">		
			<li>
			${produto.nome} - <fmt:formatDate value="${produto.data}" pattern="dd/MM/yyyy"/>
			<a href="/Atividade10102023/editaProduto?id=${produto.id}"> editar </a>
			<a href="/Atividade10102023/removeProduto?id=${produto.id}"> remover </a>
			</li>			
		</c:forEach>		
		<a href="/Atividade10102023/criar.jsp"> Criar novo produto </a>
	</ul>
</body>
</html>