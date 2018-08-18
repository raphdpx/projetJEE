<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Test</title>
    </head>
    <body>
    	
    	<c:if test="${ !empty form.resultat }"> <p><c:out value= "${ form.resultat }" /></p></c:if>
    	
    	<form method="post" action="bonjour">
    		<p>
    			<label for="login">Login : </label>
    			<input type="text" id="login" name="login" />
    		</p>
    		<p>
    			<label for="pass">Mot de passe : </label>
    			<input type="password" id="pass" name="pass" />
    		</p>
    		<input type="submit" />
       	</form>
    	
    </body>
</html>