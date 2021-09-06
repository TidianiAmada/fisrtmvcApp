<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ include file="../common/menu.jspf" %>

<div class="container">
	<h2>Connexion</h2>
	<form action="/log" method="post">
	
		<label for="username" >Nom d'utilisateur</label>
		<input type="text" name="username" id="username">
		<label for="password" >Mot de passe</label>
		<input type="password" name="password" id="password">
		<button type="submit" > Se connecter</button>
	</form>
</div>	
