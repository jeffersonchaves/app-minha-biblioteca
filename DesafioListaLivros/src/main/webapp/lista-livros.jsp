<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@page import="java.util.List"%>
<%@ page import="app.entities.Livro" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Minha Lista de Livros</title>

<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:wght@300&display=swap" rel="stylesheet">

<style type="text/css">

	body {
		font-family: 'Roboto Condensed', sans-serif;
	}
	
	h2, a {
		margin-left: 5px;
	}

	div.item {
		margin-left: 45px;
		border: solid 1px;
		margin: 5px 15px 5px 5px;
	}
	
	b {
		color: #4d64ff;
	}

</style>


</head>
<body>

	<% 
		List<Livro> livros = (List<Livro>) request.getAttribute("livrosAttr");
	%>
	
	<h2>Minha Lista de livros</h2>
	
	<a href="cadastro.jsp">cadastrar</a>
	
	<!-- Irá repertir LIVRO vezes -->
	<% for(Livro livro: livros){ %>
		<div class="item">
		<ul>
			<li><b>título:</b> <%= livro.getTitulo() %> </li>
			<li><b>autor:</b> <%= livro.getAutor().getNome() %> </li>
			<li><b>gênero:</b> <%= livro.getGenero() %> </li>
			<li><b>ano:</b> <%= livro.getAno() %> </li>
			<li><b>páginas:</b> <%= livro.getPaginas() %> </li>
		</ul>
		</div>
	<% } %>
</body>
</html>