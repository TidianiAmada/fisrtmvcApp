<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
    rel="stylesheet"
    href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
    integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
    crossorigin="anonymous"
    >
<title>Insert title here</title>
</head>
<body>
	<h1>Connexion</h1>
	<form action="/login.do">
		<label for="username" >Nom d'utilisateur</label>
		<input type="text" name="username" id="username">
		<label for="password" >Mot de passe</label>
		<input type="password" name="password" id="password">
		<button type="submit" > Se connecter</button>
	</form>
	
</body>
</html>