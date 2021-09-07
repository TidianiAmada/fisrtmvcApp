<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="../common/menu.jspf" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<div class="container">
<form:form  method="post" action="/update?previous_id=${previous_id }" modelAttribute="todo">

 <fieldset>
 	<form:label path="desc">Description</form:label>
 	<form:input path="desc"/>
 	<input type="submit" class="btn btn-warning"/>
 
 </fieldset>		
	
</form:form>

</div>