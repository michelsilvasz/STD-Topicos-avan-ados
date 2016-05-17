<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>STD - Sistema Tramitação de Documentos</title>
</head>
<body>
	<!-- Inicio cabecalho -->
	<header>
		
	</header>
	<!-- Fim cabecalho -->
	
	<!-- Inicio section -->
	<section>
		<form action="login" method="post">
			<p>
				<label>Usu&aacute;rio</label><br />
				<input type="text" name="usuario" size="30" maxlength="20" placeholder="Usu&aacute;rio" /><br />
				<label>Senha</label><br />
				<input type="password" name="senha" size="30" maxlength="20" placeholder="Senha"/><br />
			</p>
			<p><input type="submit" value="Enviar" /></p>
			<a href="control">Esqueceu a senha</a>
		
		</form>
	
	</section>
	<!-- Fim section -->	
	
	<!-- inicio rodape -->
	<footer>
		<jsp:include page="templates/footer.html"></jsp:include>
	</footer>
</body>
</html>