<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<jsp:useBean id="Hotel" scope="request" type="model.Hotel"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sucesso!</title>
</head>
<body>
<h1>Hotel encontrado com sucesso!</h1>
<hr>
<div class="conteudo">
  <img src="https://img.freepik.com/vetores-gratis/executivos-com-o-polegar-para-cima-para-ilustracao-de-hoteis-de-estilo-de-vida-moderno-e-moderno_335657-392.jpg" alt="imgam hotel">

<div class="informacoes">
 <h2>
ID: <c:out value=" ${Hotel.id }"></c:out> </br>
 </h2>
<h2>
 Hotel: <c:out value="${Hotel.nome }"></c:out></br>
 </h2>
 <p>

 <strong>Avaliação:</strong> <c:out value="${Hotel.estrelas }"></c:out></br>
</p>
 <p>

 <strong>Descrição:</strong> <c:out value="${Hotel.descricao }"></c:out></br>
</p>
</div>
</div>


</body>
<style>
@import url('https://fonts.googleapis.com/css2?family=Anuphan:wght@100&family=Poppins:wght@200&display=swap');
*{box-sizing:border-box;font-family: 'Anuphan', sans-serif;
font-family: 'Poppins', sans-serif;}

hr{background-color:red;}
h1{color:red;text-align:center; font-weight:900;}
.conteudo{display:flex;width:1100px;margin:auto;justify-content:center;align-items:center;}
p{font-size:1.2rem;font-weight:500}

h2{font-size:1.5rem;font-weight:800;}

</style>
</html>