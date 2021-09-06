
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="../common/menu.jspf" %>
<h2>Welcome ${username} </h2>


<div class="container">
<table class="table table-hover">
	<thead class="thead-dark">
		<tr>
			<th>ID</th>
            <th>Name</th>
            <th>Description</th>
            <th>Date</th>
            
            <th>Action </th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${todos}" var="td" varStatus="Status">
			<tr>
				<td>${td.id}</td>
				<td>${td.username}</td>
				<td>${td.desc}</td>
				<td>${td.targetDate}</td>
				
				<td><a class = "btn btn-danger" href="/droplist?id=${td.id}"> Delete</a> 
				<a class = "btn btn-warning" href="/updateForm?desc=${td.desc}&id=${td.id}"> Update</a></td>	
		
			</tr>
		</c:forEach>
	</tbody>
</table>
</div>
<div class="container">
<form action="/addlist" method="post">
	<label for="id" >ID</label>
	<input type="number" name="id" id="id">
	<label for="name" >Name</label>
	<input type="text" name="name" id="name">
	<label for="desc" >Description</label>
	<input type="text" name="desc" id="desc">
	<label for="date" >Date</label>
	<input type="date" name="date" id="date">
	<label for="isDone" >Is Done ?</label>
	<input type="radio" name="isDone" id="isDone">
	<button type="submit" > Ajouter</button>
</form>

</div>