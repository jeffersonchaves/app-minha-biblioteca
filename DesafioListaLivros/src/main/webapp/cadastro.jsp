<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Minha Biblioteca</title>

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
	
	form {
		margin-top: 15px;
		margin-left: 5px;
	}
	
	
	input {
		margin-bottom: 15px;
	}

</style>

</head>
<body>

	<h2>Cadastrar Livro</h2>
	
	<a href="${pageContext.request.contextPath}">voltar</a>
	
	<form action="${pageContext.request.contextPath}/cadastrar" method="post">
		
		<label>titulo</label>
		<input type="text" name="tituloField" />
		<br />
		
		<label>autor</label>
		<input type="text" name="autorField" />
		<br />
		
		<label>gênero</label>
		<input type="text" name="generoField" />
		<br />
		
		<label>ano</label>
		<input type="number" name="anoField" />
		<br />
		
		<label>páginas</label>
		<input type="number" name="paginasField" />
		<br />
		
		<input type="submit" value="cadastrar" />
	
	</form>

</body>
</html>