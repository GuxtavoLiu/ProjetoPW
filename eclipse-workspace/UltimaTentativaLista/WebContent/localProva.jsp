<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="conteudo">
		<h3>Descobrir o local de prova</h3>
		<br>
		<form action="ConsultaDeLocal" method="post"> <!--  "ConsultaDeLocal é o nome de destino que se coloca no servlet "@webservlet" -->
			<label>Insira seu nome completo: </label><br> <input type="text"
				name="nome"><br> <br>
			<input type="radio" name="curso" value="1">
			Técnico em Informática<br> <input type="radio" name="curso"
				value="2"> Técnico em Alimentos<br> <input
				type="radio" name="curso" value="3">
			Técnico em Agropecuária<br> <input type="submit"
				value="Descobrir">
		</form>
		<p>Sua sala é ${resultadoSala}</p>
		
	</div>
</body>
</html>