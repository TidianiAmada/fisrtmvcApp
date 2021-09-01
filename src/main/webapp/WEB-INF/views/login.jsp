<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Insert title here</title>
</head>
<body>
	<h1>Connexion</h1>
	<form action="/log" method="post">
	
		<label for="username" >Nom d'utilisateur</label>
		<input type="text" name="username" id="username">
		<label for="password" >Mot de passe</label>
		<input type="password" name="password" id="password">
		<button type="submit" > Se connecter</button>
	</form>
	
</body>
</html>